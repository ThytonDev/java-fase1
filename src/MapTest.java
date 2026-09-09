import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main() {
        //Crear mapa (2 valores) Map<clave, valor> = new HashMap<>();
        Map<String, Integer> inventario = new HashMap<>();
        //.put para meter la clave y valor
        inventario.put("Apple", 5);
        inventario.put("Banana", 12);
        inventario.put("Orange", 8);
        //.get te da el valor de la clave
        //inventario te da el mapa
        System.out.println("Stock de Apple: " + inventario.get("Apple"));
        System.out.println("Inventario: " + inventario);

        //Crear set (1 valor) Map<clave> = new HashSet<>();
        Set<String> categories = new HashSet<>();
        //.add para añadir elementos SET.
        categories.add("Bebida");
        categories.add("Fruta");
        categories.add("Vegetales");
        categories.add("Lacteos");

        System.out.println(categories);
        System.out.println(categories.contains("Fruta"));
        System.out.println(categories.contains("Carne"));
    }
}
