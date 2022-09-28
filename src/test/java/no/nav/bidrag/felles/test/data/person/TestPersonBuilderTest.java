package no.nav.bidrag.felles.test.data.person;

import static no.nav.bidrag.felles.test.data.person.FamilieBuilder.familie;
import static no.nav.bidrag.felles.test.data.person.ForeldreBuilder.foreldre;
import static no.nav.bidrag.felles.test.data.person.Kjonn.KVINNE;
import static no.nav.bidrag.felles.test.data.person.Kjonn.MANN;
import static no.nav.bidrag.felles.test.data.person.Relasjon.SAMME_ETTERNAVN;
import static no.nav.bidrag.felles.test.data.person.TestPersonBuilder.person;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isOneOf;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;

import java.time.LocalDate;

import org.junit.Test;

public class TestPersonBuilderTest {

    @Test
    public void testPersonIdent() {
        TestPerson person = person()
                .opprett();

        assertThat(person, is(not(nullValue())));
        assertThat(person.getPersonIdent(), is(not(nullValue())));
        assertThat(person.getPersonIdent().length(), is(11));
    }

    @Test
    public void testKjonn() {
        assertThat(person().opprett().getKjonn(), isOneOf(KVINNE, MANN));
        assertThat(person().kjonn(KVINNE).opprett().getKjonn(), is(equalTo(KVINNE)));
        assertThat(person().kjonn(MANN).opprett().getKjonn(), is(equalTo(MANN)));
    }

    @Test
    public void testFodtDato() {
        assertThat(
                person().alder(10).opprett().getFodselsdato(),
                is(both(greaterThan(LocalDate.now().minusYears(11)))
                        .and(lessThanOrEqualTo(LocalDate.now().minusYears(10)))));
    }

    @Test
    public void testFornavn() {
        assertThat(
                person().opprett().getFornavn(),
                is(not(nullValue())));
        assertThat(
                person().fornavn("Ola").opprett().getFornavn(),
                is(equalTo("Ola")));
    }

    @Test
    public void testEtternavn() {
        assertThat(
                person().opprett().getEtternavn(),
                is(not(nullValue())));
        assertThat(
                person().etternavn("Nordmann").opprett().getEtternavn(),
                is(equalTo("Nordmann")));
    }

    @Test
    public void testForeldre() {
        TestPerson person = person()
                .fornavn("Ola")
                .etternavn("Nordmann")
                .med(foreldre()
                        .mor(p -> p
                                .fornavn("Kari"),
                                SAMME_ETTERNAVN)
                        .far(p -> p
                                .fornavn("Per"),
                                SAMME_ETTERNAVN))
                .opprett();

        TestPerson mor = person.getMor();
        assertThat(mor, is(not(nullValue())));
        assertThat(mor.getFornavn(), is(equalTo("Kari")));
        assertThat(mor.getEtternavn(), is(equalTo("Nordmann")));
        assertThat(mor.getBarn().get(0), is(person));

        TestPerson far = person.getFar();
        assertThat(far, is(not(nullValue())));
        assertThat(far.getFornavn(), is(equalTo("Per")));
        assertThat(far.getEtternavn(), is(equalTo("Nordmann")));
        assertThat(far.getBarn().get(0), is(person));
    }

    @Test
    public void testFamilieMedPartner() {
        TestPerson person = person()
                .kjonn(MANN)
                .fornavn("Ola")
                .etternavn("Nordmann")
                .med(familie()
                        .partner(p -> p
                                .fornavn("Kari"),
                                SAMME_ETTERNAVN)
                        .barn(SAMME_ETTERNAVN))
                .opprett();

        TestPerson barn = person.getBarn().get(0);
        assertThat(barn.getEtternavn(), is(equalTo("Nordmann")));

        assertThat(barn.getFar(), is(person));
        assertThat(barn.getMor(), is(not(nullValue())));
        assertThat(barn.getMor().getFornavn(), is(equalTo("Kari")));
        assertThat(barn.getMor().getEtternavn(), is(equalTo("Nordmann")));
    }
}
