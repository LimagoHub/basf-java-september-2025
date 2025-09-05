import java.awt.*;
import java.awt.event.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Fenster extends Frame  {


    public Fenster() {
        setSize(300, 300);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                beenden();
            }
        } );
        addKeyListener(new MyKeyListener());
    }
    public static void main(String[] args) {
        new Fenster().setVisible(true);
    }

    private void beenden() {
        // Viel Code
        dispose();
    }

    /*class MyWidowListener extends WindowAdapter {
        @Override
        public void windowClosing(final WindowEvent e) {
            beenden();
        }
    }*/

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(final KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
              beenden();
            }
        }
    }
}