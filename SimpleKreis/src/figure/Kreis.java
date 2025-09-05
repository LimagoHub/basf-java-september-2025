package figure;

public class Kreis {
    private double radius;

    public Kreis() {
        this(0.0);
    }

    public Kreis(final double radius) {
        setRadius(radius);
    }

    public void setUmfang(final double umfang) {

        setRadius( umfang / (2 * Math.PI));
    }

    public double getUmfang(){
        return 2.0 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(final double radius) {
        if(radius < 0.0) {
            throw new IllegalArgumentException("radius cannot be negative");
        }
        this.radius = radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kreis{");
        sb.append("radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
