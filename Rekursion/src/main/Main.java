package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       new Main().run();
    }

    private void run() {
        int [] feld = {10,90,40};
        int maxValue = max(feld);
        System.out.println(maxValue);
    }

    int max(int [] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int ersterWert = array[0];
        int maxOfRest = max(Arrays.copyOfRange(array, 1, array.length));
        if (ersterWert > maxOfRest) {
            return ersterWert;
        }
        return maxOfRest;
    }
}