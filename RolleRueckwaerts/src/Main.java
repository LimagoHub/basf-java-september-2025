package main;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String [] wochentage = {"Montag", "Dienstag","Mittwoch","Donnerstag","Freitag","Samstag","Sonntag"};

        for (int i = wochentage.length - 1; i >= 0; i--) {
            System.out.println(wochentage[i]);
        }
    }
}