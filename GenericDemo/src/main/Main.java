package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       new Main().run();
    }

    private void run() {
        List<Tier> tiere = new ArrayList<>();
        List<Hund> hunde = new ArrayList<>();
        List<Katze> katzen = new ArrayList<>();

        tiere.add(new Tier());
        tiere.add(new Hund());
        tiere.add(new Katze());
        tiere.add(new Pudel());

        hunde.add(new Hund());
        hunde.add(new Pudel());

        katzen.add(new Katze());
        ausgabe(tiere);
        ausgabe(hunde);
        ausgabe(katzen);
    }

    void ausgabe(List<? extends Tier> meinmeListe) {

        for (Tier tier : meinmeListe) {
            System.out.println(tier);
        }
    }

    List<? super Tier> createFilledList() {
        var x =  new ArrayList<Object>();
        x.add(new Tier());
        return x;
    }
}

class Tier {

}

class Hund extends Tier {}
class Katze extends Tier {}

class Pudel extends Hund {}