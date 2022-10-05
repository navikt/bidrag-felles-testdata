package no.nav.bidrag.felles.test.data.navn;

import java.time.LocalDate;

import lombok.Data;
import no.nav.bidrag.felles.test.data.PeriodisertTestData;

@Data
public class TestNavn implements PeriodisertTestData {
    private final String fornavn;
    private final String etternavn;
    private final LocalDate periodeFra;
    private final LocalDate periodeTil;

    public String getSammensatt() {
        return getEtternavn() + ", " + getFornavn();
    }
}
