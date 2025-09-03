package main;

public class Main {
    public static void main(String[] args) {
        int a = 1000;
        int b = 1;

        long produkt = 0;

        for (int i = 0; i < b; i++) {
            produkt += a;
        }
        System.out.println(produkt);
    }
}