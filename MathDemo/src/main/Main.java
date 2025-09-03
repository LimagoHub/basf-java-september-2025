package main;
public class Main {


    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        MyMath myMath = new MyMath();
        double ergebnis = myMath.summe(x, y);
        System.out.println(ergebnis);
   }
}

class MyMath {


   public double summe(double x, double y) {
       return x + y;
   }


   public double quadratwurzel(double quadratzahl) {
       double xn = quadratzahl / 2.0;

       for (int i = 0; i < 10; i++) {
           xn = 0.5 * (xn + quadratzahl / xn);
       }

       return xn;
   }
}