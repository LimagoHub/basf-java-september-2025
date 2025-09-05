//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

package main;

import java.awt.*;
import java.awt.event.*;

public class Fenster extends Frame implements KeyListener, MouseListener, MouseMotionListener {

    private final static int SIZE = 600;
    private String message="Hallo: ";

    private int x,y;

    public Fenster() {
        x = y = SIZE/2;
        setSize(SIZE, SIZE);
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
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

       switch (e.getKeyCode()) {
           case KeyEvent.VK_LEFT: x-=5; break;
           case KeyEvent.VK_RIGHT: x+=5; break;
           case KeyEvent.VK_UP: y-=5; break;
           case KeyEvent.VK_DOWN: y+=5; break;
           case KeyEvent.VK_ESCAPE: dispose(); break;
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

    @Override
    public void mouseDragged(final MouseEvent e) {

    }

    @Override
    public void mouseMoved(final MouseEvent e) {
        x += (e.getX() - x) / 10;
        y += (e.getY() - y) / 10;
        repaint();
    }
}