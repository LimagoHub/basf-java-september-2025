package app;

import figure.Kreis;

public class Application {

    public static void main(String[] args) {
        Kreis kreis = new Kreis();
        kreis.setRadius(10.0);

        System.out.println(kreis.getRadius());
        System.out.println(kreis.getUmfang());

    }
}
