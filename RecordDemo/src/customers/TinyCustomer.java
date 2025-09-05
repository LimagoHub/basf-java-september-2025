package customers;

import java.util.Objects;

public class TinyCustomer {
    private final int id;
    private final String firma;

    public TinyCustomer(final int id, final String firma) {
        this.id = id;
        this.firma = firma;
    }

    public int getId() {
        return id;
    }

    public String getFirma() {
        return firma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TinyCustomer{");
        sb.append("id=").append(id);
        sb.append(", firma='").append(firma).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        final TinyCustomer that = (TinyCustomer) o;
        return id == that.id && Objects.equals(firma, that.firma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firma);
    }
}
