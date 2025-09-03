package main;
public class Main {
    public static void main(String[] args) {
        final long population = 8_000_000_000L;
        long aktiveSpieler = 1L;
        int anzahlRunden = 0;
        int nachfolger = 3;

        while(aktiveSpieler < population) {
            anzahlRunden++;
            aktiveSpieler *= nachfolger;
        }

        System.out.println(anzahlRunden);
    }
}