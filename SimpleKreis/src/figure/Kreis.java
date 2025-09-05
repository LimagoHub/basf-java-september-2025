package figure;

public class Kreis {
    private double radius;

    public Kreis() {
        radius = 0;
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
