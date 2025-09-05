//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package main;

import office.Dokument;
import office.Excel;
import office.Word;
import office.WordPad;

public class Main {
    public static void main(String[] args) {

        Dokument dokument = new Excel();
        dokument.drucken();

        Object w = new Word();
    }
}