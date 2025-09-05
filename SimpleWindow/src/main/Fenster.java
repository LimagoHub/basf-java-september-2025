//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

package main;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Fenster extends Frame implements KeyListener, MouseListener {


    private String message="Hallo: ";

    public Fenster() {
        setSize(300, 300);
        addKeyListener(this);
        addMouseListener(this);
    }

    @Override
    public void paint(final Graphics g) {
        g.drawString(message , 100, 100);

    }

    public static void main(String[] args) {
      new Fenster().setVisible(true);
    }

    @Override
    public void keyTyped(final KeyEvent e) {

    }

    @Override
    public void keyPressed(final KeyEvent e) {

        if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
            dispose();
        }

        message = "Taste wurde gedrückt";
        repaint();
    }

    @Override
    public void keyReleased(final KeyEvent e) {

    }

    @Override
    public void mouseClicked(final MouseEvent e) {

    }

    @Override
    public void mousePressed(final MouseEvent e) {

    }

    @Override
    public void mouseReleased(final MouseEvent e) {

    }

    @Override
    public void mouseEntered(final MouseEvent e) {
        message = "Maus ist zuhaus";
        repaint();
    }

    @Override
    public void mouseExited(final MouseEvent e) {
        message = "Maus ist raus";
        repaint();
    }
}