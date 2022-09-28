package no.nav.bidrag.felles.test.data.person;

import static no.nav.bidrag.felles.test.data.time.DateUtils.parseString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import no.nav.bidrag.felles.test.data.RandomTestData;
import no.nav.bidrag.felles.test.data.adresse.TestAdresse;
import no.nav.bidrag.felles.test.data.adresse.TestAdresseBuilder;
import no.nav.bidrag.felles.test.data.time.DateBuilder;

public class TestPersonBuilder {
    private IdentType identType = IdentTyper.FNR;
    private Kjonn kjonn;
    private int alderMin = 25;
    private int alderMax = 80;
    private LocalDate fodtDato;
    private LocalDate dodDato;
    private String fornavn;
    private String etternavn;

    private ForeldreBuilder foreldreBuilder;
    private TestPerson mor;
    private TestPerson far;
    private List<FamilieBuilder> familier = new ArrayList<>();

    private Diskresjon diskresjon;
    private Spraak spraak;

    private TestAdresse boadresse;
    private TestAdresseBuilder boadresseBuilder;

    private TestAdresse postadresse;
    private TestAdresseBuilder postadresseBuilder;

    public static TestPersonBuilder person() {
        return new TestPersonBuilder();
    }

    public TestPersonBuilder identType(IdentType identType) {
        this.identType = identType;
        return this;
    }

    public TestPersonBuilder kjonn(Kjonn kjonn) {
        this.kjonn = kjonn;
        return this;
    }

    public TestPersonBuilder fodtDato(LocalDate fodtDato) {
        this.fodtDato = fodtDato;
        return this;
    }

    public TestPersonBuilder fodt(DateBuilder dateBuilder) {
        return fodtDato(dateBuilder.get());
    }

    public TestPersonBuilder fodtDato(String fodtDatoStr) {
        this.fodtDato = parseString(fodtDatoStr);
        return this;
    }

    public TestPersonBuilder alder(int alderMin, int alderMax) {
        this.fodtDato = null;
        this.alderMin = alderMin;
        this.alderMax = alderMax;
        return this;
    }

    public TestPersonBuilder alder(int alder) {
        return alder(alder, alder);
    }

    public TestPersonBuilder barnAlder() {
        return alder(0, 18);
    }

    public TestPersonBuilder voksenAlder() {
        return alder(25, 40);
    }

    public TestPersonBuilder besteforeldreAlder() {
        return alder(45, 60);
    }

    public TestPersonBuilder dodDato(LocalDate dodDato) {
        this.dodDato = dodDato;
        return this;
    }

    public TestPersonBuilder erDod() {
        return dodDato(LocalDate.now().minusDays(3));
    }

    public TestPersonBuilder fornavn(String fornavn) {
        this.fornavn = fornavn;
        return this;
    }

    public TestPersonBuilder etternavn(String etternavn) {
        this.etternavn = etternavn;
        return this;
    }

    public TestPersonBuilder mor(TestPerson mor, Relasjon... relasjoner) {
        this.mor = mor;
        return relasjonTil(mor, relasjoner);
    }

    public TestPersonBuilder far(TestPerson far, Relasjon... relasjoner) {
        this.far = far;
        return relasjonTil(far, relasjoner);
    }

    public TestPersonBuilder med(ForeldreBuilder foreldre) {
        this.foreldreBuilder = foreldre;
        return this;
    }

    public TestPersonBuilder med(FamilieBuilder familie) {
        this.familier.add(familie);
        return this;
    }

    public TestPersonBuilder relasjonTil(TestPerson person, Relasjon... relasjoner) {
        for (Relasjon relasjon : relasjoner) {
            relasjon.relater(person, this);
        }
        return this;
    }

    public TestPersonBuilder diskresjon(Diskresjon diskresjon) {
        this.diskresjon = diskresjon;
        return this;
    }

    public TestPersonBuilder spraak(Spraak spraak) {
        this.spraak = spraak;
        return this;
    }

    public TestPersonBuilder boadresse(TestAdresse boadresse) {
        this.boadresseBuilder = null;
        this.boadresse = boadresse;
        return this;
    }

    public TestPersonBuilder boadresse(TestAdresseBuilder adresseBuilder) {
        this.boadresse = null;
        this.boadresseBuilder = adresseBuilder;
        return this;
    }

    public TestPersonBuilder postadresse(TestAdresse boadresse) {
        this.postadresseBuilder = null;
        this.postadresse = boadresse;
        return this;
    }

    public TestPersonBuilder postadresse(TestAdresseBuilder adresseBuilder) {
        this.postadresse = null;
        this.postadresseBuilder = adresseBuilder;
        return this;
    }

    public TestPerson opprett() {
        LocalDate fodtDato = beregnFodtDato();
        Kjonn kjonn = this.kjonn != null
                ? this.kjonn
                : RandomTestData.random().oneOf(Kjonn.class);

        String personIdent = identType.generer(fodtDato, kjonn);

        String fornavn = this.fornavn != null
                ? this.fornavn
                : NavnListe.randomFornavn(kjonn);

        String etternavn = this.etternavn != null
                ? this.etternavn
                : NavnListe.randomEtternavn();

        TestAdresse boadresse = finnAdresse(this.boadresse, this.boadresseBuilder);
        TestAdresse postadresse = finnAdresse(this.postadresse, this.postadresseBuilder);

        Foreldre foreldre = finnForeldre(
                new TestPerson(
                        personIdent,
                        kjonn,
                        fodtDato,
                        dodDato,
                        fornavn,
                        etternavn,
                        mor,
                        far,
                        diskresjon,
                        spraak,
                        boadresse,
                        postadresse));

        TestPerson person = new TestPerson(
                personIdent,
                kjonn,
                fodtDato,
                dodDato,
                fornavn,
                etternavn,
                foreldre.getMor(),
                foreldre.getFar(),
                diskresjon,
                spraak,
                boadresse,
                postadresse);

        for (FamilieBuilder familie : familier) {
            familie.get(person);
        }
        return person;
    }

    public List<TestPerson> opprett(int antall) {
        ArrayList<TestPerson> personer = new ArrayList<>(antall);
        for (int i = 0; i < antall; i++) {
            personer.add(opprett());
        }
        return personer;
    }

    private static TestAdresse finnAdresse(TestAdresse adresse, TestAdresseBuilder adresseBuilder) {
        if (adresse != null) {
            return adresse;
        }
        if (adresseBuilder != null) {
            return adresseBuilder.opprett();
        }
        return null;
    }

    private Foreldre finnForeldre(TestPerson tmpPerson) {
        return foreldreBuilder != null
                ? foreldreBuilder.get(tmpPerson)
                : new Foreldre(null, null);
    }

    private LocalDate beregnFodtDato() {
        if (fodtDato != null) {
            return fodtDato;
        }
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        return RandomTestData.random().dateBetween(
                tomorrow.minusYears(alderMax + 1),
                tomorrow.minusYears(alderMin));
    }

    @Data
    public static class RelasjonBuilder {
        private final TestPersonBuilder personBuilder;
        private final Relasjon[] relasjoner;
    }
}
