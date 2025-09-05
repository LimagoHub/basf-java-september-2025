//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

package main;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Fenster extends Frame implements KeyListener, MouseListener {

    private final static int SIZE = 600;
    private String message="Hallo: ";

    private int x,y;

    public Fenster() {
        x = y = SIZE/2;
        setSize(SIZE, SIZE);
        addKeyListener(this);
        addMouseListener(this);
    }

    @Override
    public void paint(final Graphics g) {
        g.drawString(message , 100, 100);
        g.drawRect(x, y, 30, 30);

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