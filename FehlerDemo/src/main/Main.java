package main;

public class Main {
    public static void main(String[] args) {


        try {
            int feld[] = new int[2];
            int a,b,c;
            a = b = 0;
            feld [100]= 10;
            c = a / b;

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Vielen Dank, Sie haben ein kleines Programm echt glücklich gemacht");
    }

}