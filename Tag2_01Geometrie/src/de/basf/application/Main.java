package de.basf.application;

import de.basf.application.de.basf.geo.Kreis;
import de.basf.application.de.basf.geo.Punkt;

public class Main {
    public static void main(String[] args) {

        Punkt p;
        Kreis k;

        k = new Kreis();
        p = k;
        System.out.println(p.toString());


    }
}