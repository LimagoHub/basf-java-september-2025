package mobil;

public abstract class Fahrzeug {
    int baujahr;
    int anzahlReifen;
    int ps;
    String marke;
    public abstract boolean istNeuwagen();
    public abstract int maxTempo(int anzahlPersonen, int gepäckInKilo);
}