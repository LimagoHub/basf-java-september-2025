package main;
public class Main {
    public static void main(String[] args) {
        Paar<Integer>  paar = new Paar<>(Integer.valueOf(1),2);
        System.out.println(paar);
    }
}

class Paar<T> {
    private T rechts, links;

    public Paar(final T rechts, final T links) {
        this.rechts = rechts;
        this.links = links;
    }

    public T getRechts() {
        return rechts;
    }

    public T getLinks() {
        return links;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Paar{");
        sb.append("rechts=").append(rechts);
        sb.append(", links=").append(links);
        sb.append('}');
        return sb.toString();
    }
}