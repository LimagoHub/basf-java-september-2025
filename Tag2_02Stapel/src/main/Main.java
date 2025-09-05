package main;

import de.basf.collections.Stapel;
import de.basf.collections.StapelException;
import geo.Kreis;
import geo.Punkt;
import tiere.Schwein;

public class Main {
    public static void main(String[] args) {

        try {  Stapel<Punkt> stapel = new Stapel<>(40);
            for (int i = 0; i < 10; i++) {
                if(! stapel.isFull()){
                    //stapel.push(new Schwein("Schwein Nr." + i));
                    stapel.push(new Punkt(i,i));
                    stapel.push(new Kreis(i));
                    //stapel.push(i);
                }
            }
            while( !stapel.isEmpty()) {
                Punkt p =  stapel.pop();
                p.rechts();
                System.out.println(p);
            }
        } catch (StapelException e) {
            e.printStackTrace();
        }
    }


}