package main;

public class Main {
    public static void main(String[] args) {
        Kaefig kaefig = new Kaefig();
        kaefig.setTier(0, new Hund() );
        kaefig.setTier(1, new Katze() );
    }
}

abstract class  Tier {}
class Hund extends Tier {}
class Katze extends Tier {}

class Kaefig {
    private Tier [] tiere = new Tier[2];

    public Tier getTier(int i) {
        return tiere[i];
    }

    public void setTier(int i, final Tier tier) {
        this.tiere[i] = tier;
    }
}
