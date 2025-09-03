package main;

public class Main {



    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int c = a>b?a:b;

        for (int i = 0; i < Wochentag.values().length; i++) {
            System.out.println(
                    Wochentag.values()[i].name()
                            + " " +Wochentag.values()[i].ordinal());
        }

    }
}
enum Wochentag {Montag, Dienstag, Mittwoch, Donnerstag, Freitag, Samstag, Sonntag};



/*class Monat {
    private final String name;
    private final int tage;

    public Monat(final String name, final int tage) {
        this.name = name;
        this.tage = tage;
    }

    public String getName() {
        return name;
    }

    public int getTage() {
        return tage;
    }
}*/