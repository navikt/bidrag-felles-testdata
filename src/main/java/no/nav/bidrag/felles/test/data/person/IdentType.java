package no.nav.bidrag.felles.test.data.person;

import static no.nav.bidrag.felles.test.data.RandomTestData.random;
import static no.nav.bidrag.felles.test.data.person.Kjonn.KVINNE;
import static no.nav.bidrag.felles.test.data.person.Kjonn.MANN;

import java.time.LocalDate;

public interface IdentType {
    String generer(LocalDate fodtDato, Kjonn kjonn);

    default String generer() {
        return generer(
                random().dateBetween(LocalDate.of(1900, 1, 1), LocalDate.now()),
                random().oneOf(KVINNE, MANN));
    }
}
