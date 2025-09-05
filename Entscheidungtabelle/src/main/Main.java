//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package main;
public class Main {
    public static void main(String[] args) {
      boolean lieferfaehig=true;
      boolean vollstaendig= true;
      boolean solvent= true;

      if(! lieferfaehig) {
          System.out.println("Nicht lieferbar");
      } else if (! vollstaendig) {
          System.out.println("Angaben vervollständigen");
      } else if (solvent ) {
          System.out.println("Lieferung auf Rechnung");
      } else {
          System.out.println("Lieferung per Nachname");
      }
    }
}