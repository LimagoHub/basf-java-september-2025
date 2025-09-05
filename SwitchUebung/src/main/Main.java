//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package main;
public class Main {

    enum Richtung {Rechts, Links, Oben, Unten}

    public static void main(String[] args) {
        Richtung richtung = Richtung.Rechts;

        switch (richtung) {
            case Rechts:
                System.out.println("Bewegung nach Rechts");
                break;
            case Links:
                System.out.println("Bewegung nach Rechts");
                break;
            case Oben:
                System.out.println("Bewegung nach Oben");
                break;
            case Unten:
                System.out.println("Bewegung nach Unten");
                break;
        }

    }
}