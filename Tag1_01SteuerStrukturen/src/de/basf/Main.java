package de.basf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int zufallsZahl = 623;
        int versuch ;
        do {
            System.out.println("Bitte geben Sie einen Zahl ein:");
            versuch = scanner.nextInt();
            if (versuch < zufallsZahl) {
                System.out.println("Ihr Versuch ist zu klein");
            }
            if (versuch > zufallsZahl) {
                System.out.println("Ihr Versuch ist zu gross");
            }

        } while( versuch != zufallsZahl);
        System.out.println("Zahl geraten!");
    }
}