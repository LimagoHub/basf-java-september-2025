package de.basf.application.de.basf.geo;

public class Punkt extends Object {

    private final static double MAX = 10.0;
    private double x;
    private  double y;

    public Punkt(){

        this(0,0);

    }
    public Punkt(double x, double y) {
        setX(x);
        setY(y);
        System.out.println("Punkt created");
    }

    private void setX(double x) {
        if(x > MAX) x = MAX;
        if (x < -MAX) x = -MAX;
        this.x = x;
    }

    private void setY( double y) {
        if(y > MAX) y = MAX;
        if (y < -MAX) y = -MAX;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName()+"{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    public void rechts() {
        rechts(1.0);
    }
    public void rechts(double schrittweite) {
        setX(getX() + schrittweite);
    }


    public void links() {
        setX(getX() - 1.0);
    }

    public void hoch() {
        setY(getY() + 1.0);
    }
    public void runter() {
        setY(getY() - 1.0);
    }
}
