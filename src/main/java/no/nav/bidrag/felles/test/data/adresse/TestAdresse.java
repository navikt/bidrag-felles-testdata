package no.nav.bidrag.felles.test.data.adresse;

import lombok.Data;

@Data
public class TestAdresse {
    private final String adresselinje1;
    private final String adresselinje2;
    private final String adresselinje3;
    private final String postnummer;
    private final String poststed;
    private final String bolignummer;
    private final Land land;
}
