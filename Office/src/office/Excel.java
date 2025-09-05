package office;

import java.io.Serializable;

public class Excel implements Dokument, Serializable {
    @Override
    public void drucken() {
        System.out.println("Excel drucken");
    }
}
