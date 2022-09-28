package no.nav.bidrag.felles.test.data.person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.ToString;
import no.nav.bidrag.felles.test.data.adresse.TestAdresse;

@Data
@ToString(exclude = { "mor", "far" })
public class TestPerson {
    private final String personIdent;
    private final Kjonn kjonn;
    private final LocalDate fodselsdato;
    private final LocalDate dodDato;
    private final String fornavn;
    private final String etternavn;

    private final TestPerson mor;
    private final TestPerson far;
    private final List<TestPerson> barn = new ArrayList<>();

    private final Diskresjon diskresjon;
    private final Spraak spraak;

    private final TestAdresse boadresse;
    private final TestAdresse postadresse;

    public TestPerson(
            String personIdent,
            Kjonn kjonn,
            LocalDate fodselsdato,
            LocalDate dodDato,
            String fornavn,
            String etternavn,
            TestPerson mor,
            TestPerson far,
            Diskresjon diskresjon,
            Spraak spraak,
            TestAdresse boadresse,
            TestAdresse postadresse) {

        this.personIdent = personIdent;
        this.kjonn = kjonn;
        this.fodselsdato = fodselsdato;
        this.dodDato = dodDato;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.mor = mor;
        this.far = far;
        this.diskresjon = diskresjon;
        this.spraak = spraak;
        this.boadresse = boadresse;
        this.postadresse = postadresse;

        if (mor != null) {
            mor.getBarn().add(this);
        }
        if (far != null) {
            far.getBarn().add(this);
        }
    }

    public String getNavn() {
        return getEtternavn() + ", " + getFornavn();
    }

    public boolean harBarn() {
        return !barn.isEmpty();
    }

    public TestPerson barn(int barnNr) {
        return barn.get(barnNr);
    }

    public TestPerson denAndreForelderen(int barnNr) {
        return denAndreForelderen(this, barn(barnNr));
    }

    public static TestPerson denAndreForelderen(TestPerson forelder1, TestPerson barn) {
        return forelder1.equals(barn.getFar())
                ? barn.getMor()
                : barn.getFar();
    }
}
