package no.nav.bidrag.felles.test.data.adresse;

import no.nav.bidrag.felles.test.data.RandomTestData;

public class TestAdresseBuilder {
    private String adresselinje1;
    private String adresselinje2;
    private String adresselinje3;
    private String postnummer;
    private String poststed;
    private String bolignummer;
    private Land land = Land.NORGE;

    public static TestAdresseBuilder adresse() {
        return new TestAdresseBuilder();
    }

    public TestAdresseBuilder adresselinje1(String adresselinje1) {
        this.adresselinje1 = adresselinje1;
        return this;
    }

    public TestAdresseBuilder adresselinje2(String adresselinje2) {
        this.adresselinje2 = adresselinje2;
        return this;
    }

    public TestAdresseBuilder adresselinje3(String adresselinje3) {
        this.adresselinje3 = adresselinje3;
        return this;
    }

    public TestAdresseBuilder bolignummer(String bolignummer) {
        this.bolignummer = bolignummer;
        return this;
    }

    public TestAdresseBuilder postnummerOgSted(String postnummer, String poststed) {
        this.postnummer = postnummer;
        this.poststed = poststed;
        return this;
    }

    public TestAdresseBuilder land(Land land) {
        this.land = land;
        return this;
    }

    public TestAdresse opprett() {

        String adresselinje1 = this.adresselinje1;
        String adresselinje2 = this.adresselinje2;
        String postnummer = this.postnummer;
        String poststed = this.poststed;

        if (adresselinje1 == null) {
            adresselinje1 = Land.NORGE.equals(land)
                    ? StedListe.randomGatenavn() + " " + RandomTestData.random().nextLong(1000l) + RandomTestData.random().oneOf("", "", "A", "B", "C")
                    : RandomTestData.random().nextLong(2000) + " Weebfoot Street";
        }

        if (adresselinje2 == null && postnummer == null && poststed == null) {
            if (Land.NORGE.equals(land)) {
                Poststed postSted = StedListe.randomPostSted();
                postnummer = postSted.getPostnummer();
                poststed = postSted.getPoststed();
            } else {
                adresselinje2 = "Duckburg, Calisota";
            }
        }

        return new TestAdresse(
                adresselinje1,
                adresselinje2,
                adresselinje3,
                postnummer,
                poststed,
                bolignummer,
                land);
    }
}
