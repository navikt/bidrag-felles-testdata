package no.nav.bidrag.felles.test.data.samhandler;

import no.nav.bidrag.felles.test.data.RandomTestData;

public class TestSamhandlerBuilder {
    private static int samhandlerNr;
    private SamhandlerIdentType identType = SamhandlerIdentType.ORGNUMMER;
    private String navn;
    private Samhandlertype type;
    private SamhandlerFagomraade fagomraade;

    public static TestSamhandlerBuilder samhandler() {
        return new TestSamhandlerBuilder();
    }

    public TestSamhandlerBuilder identType(SamhandlerIdentType identType) {
        this.identType = identType;
        return this;
    }

    public TestSamhandlerBuilder navn(String navn) {
        this.navn = navn;
        return this;
    }

    public TestSamhandlerBuilder type(Samhandlertype type) {
        this.type = type;
        return this;
    }

    public TestSamhandlerBuilder fagomraade(SamhandlerFagomraade fagomraade) {
        this.fagomraade = fagomraade;
        return this;
    }

    public TestSamhandler opprett() {
        String id = Long.toString(80000000000l + RandomTestData.random().nextLong(20000000000l));
        String shIdent = id;

        String navn = this.navn != null
                ? this.navn
                : "Samhandler " + (++samhandlerNr);

        return new TestSamhandler(
                id,
                shIdent,
                identType,
                navn,
                type,
                fagomraade);
    }
}
