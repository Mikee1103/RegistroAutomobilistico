import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Targa, Proprietario> mappaAuto = new HashMap<>();

        Proprietario proprietario1 = new Proprietario("corty", "corto", "....");
        Proprietario proprietario2 = new Proprietario("cisti", "gc", ".....");
        Proprietario proprietario3 = new Proprietario("gus", "snus", "....");
        Targa targa1 = new Targa("AB123CD");
        Targa targa2 = new Targa("EF456GH");
        Targa targa3 = new Targa("XY789ZT");
        mappaAuto.put(targa1, proprietario1);
        System.out.println("\n");
        mappaAuto.put(targa2, proprietario2);
        System.out.println("\n");
        mappaAuto.put(targa3, proprietario3);
        System.out.println("\n");

        System.out.println(mappaAuto);
    }
}
