package no.nav.bidrag.felles.test.data.person;

import java.time.LocalDate;

import no.nav.bidrag.felles.test.data.RandomTestData;

public enum IdentTyper implements IdentType {
    FNR {
        @Override
        public String generer(LocalDate fodtDato, Kjonn kjonn) {
            return new IdentBuilder()
                    .withDate(fodtDato)
                    .withPersonnummer(kjonn, fodtDato.getYear())
                    .toString();
        }
    },

    DNR {
        @Override
        public String generer(LocalDate fodtDato, Kjonn kjonn) {
            return new IdentBuilder()
                    .withDate(fodtDato)
                    .increaseDigit(0, 4)
                    .withPersonnummer(kjonn, fodtDato.getYear())
                    .toString();
        }

    },

    BNR {
        @Override
        public String generer(LocalDate fodtDato, Kjonn kjonn) {
            return new IdentBuilder()
                    .withDate(fodtDato)
                    .increaseDigit(2, 2)
                    .withPersonnummer(kjonn, fodtDato.getYear())
                    .toString();
        }
    },

    NPID {
        @Override
        public String generer(LocalDate fodtDato, Kjonn kjonn) {
            return new IdentBuilder()
                    .withDate(RandomTestData.random().dateBetween(LocalDate.of(1859, 1, 1), LocalDate.of(2040, 1, 1)))
                    .increaseDigit(2, 2)
                    .withPersonnummer(kjonn, fodtDato.getYear())
                    .toString();
        }
    },

    DOLLY {
        @Override
        public String generer(LocalDate fodtDato, Kjonn kjonn) {
            return new IdentBuilder()
                    .withDate(fodtDato)
                    .increaseDigit(2, 4)
                    .withPersonnummer(kjonn, fodtDato.getYear())
                    .toString();
        }
    },

    TENOR {
        @Override
        public String generer(LocalDate fodtDato, Kjonn kjonn) {
            return new IdentBuilder()
                    .withDate(fodtDato)
                    .increaseDigit(2, 8)
                    .withPersonnummer(kjonn, fodtDato.getYear())
                    .toString();
        }
    },

    DODFODT {
        @Override
        public String generer(LocalDate fodtDato, Kjonn kjonn) {
            return new IdentBuilder()
                    .withDate(fodtDato)
                    .withDodfodtNr(++dodfodtNr)
                    .toString();
        }
    },

    UGYLDIG {
        @Override
        public String generer(LocalDate fodtDato, Kjonn kjonn) {
            return new IdentBuilder()
                    .withDate(fodtDato)
                    .withPersonnummer(kjonn, fodtDato.getYear())
                    .set(2, 2, 19)
                    .toString();
        }
    };

    private static int dodfodtNr;
}