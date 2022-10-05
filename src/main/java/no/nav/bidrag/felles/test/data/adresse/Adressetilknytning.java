package no.nav.bidrag.felles.test.data.adresse;

import java.time.LocalDate;

import lombok.Data;
import no.nav.bidrag.felles.test.data.PeriodisertTestData;

@Data
public class Adressetilknytning implements PeriodisertTestData {
    private final TestAdresse adresse;
    private final Adressetype type;
    private final LocalDate periodeFra;
    private final LocalDate periodeTil;
}
