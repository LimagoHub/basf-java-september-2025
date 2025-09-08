package main;

public class Main {

    enum Monat {Januar(31), Februar(28), March(31), April(30), May(31), June(30);

        private int tage;
        Monat(int tage) {
            this.tage = tage;
        }
        public int anzahlTage (){
           return tage;
        }

    }

    static int i =  0;

    public static void main(String[] args) {
        foo();
    }

    static void foo() {

        if (i > 10) return;
        i++;
        System.out.println(i);
        foo();

    }
}
