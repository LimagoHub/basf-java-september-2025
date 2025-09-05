package mobil;



public class Auto extends Fahrzeug {

    private static int gesamtAnzahl;

    static {
        gesamtAnzahl = 0;
    }

    public Auto() {
        gesamtAnzahl++;
    }

    @Override
    protected void finalize() throws Throwable {
        gesamtAnzahl--;
    }

    @Override
    public boolean istNeuwagen() {
        return baujahr >= 2021;
    }

    @Override
    public int maxTempo(final int anzahlPersonen, final int gepäckInKilo) {
        return ps-anzahlPersonen*25-gepäckInKilo;
    }

    public static int getGesamtAnzahl() {
        return gesamtAnzahl;
    }
}
