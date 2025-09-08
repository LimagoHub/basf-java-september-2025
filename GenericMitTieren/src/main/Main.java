package main;

public class Main {
    public static void main(String[] args) {
        Kaefig<Hund> kaefig = new Kaefig<>();
        kaefig.setTier(0, new Hund() );
        kaefig.setTier(1, new Katze() );
    }
}

abstract class  Tier {}
class Hund extends Tier {}
class Katze extends Tier {}

class Kaefig<T extends Tier> {
    private T [] tiere = (T []) new Object[2];

    public T getTier(int i) {
        return tiere[i];
    }

    public void setTier(int i, final T tier) {
        this.tiere[i] = tier;
    }
}
