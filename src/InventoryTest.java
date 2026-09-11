import java.util.Scanner;

public class InventoryTest {
    public static void main() {
        //Creo el mapa con el constructor
        Inventory inventory = new Inventory();
        //Agrego productos con el metodo.
        //inventory.addProduct(new Product("Apple", 5));
/*      Leccion 7,8
        try {
            System.out.println(inventory.findByName("Apple").getName());
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(inventory.findByName("Melon").getName());
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
 */
        try {
            inventory.sellProduct("Apple", 3);
            System.out.println(inventory.findByName("Apple").getStock());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
/*      Leccion 9
        try {
            inventory.sellProduct("Apple", 100);
            System.out.println(inventory.findByName("Apple").getStock());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            inventory.sellProduct("Melon", 3);
            System.out.println(inventory.findByName("Melon").getStock());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
 */
        //Creo el bucle del menu.
        Scanner sc =new Scanner(System.in); // Creo el scanner para los inputs del usuario.
        boolean salir = false; //Condicion para salir del menu

        while (!salir) {
            System.out.println("1.Añadir");
            System.out.println("2.Vender");
            System.out.println("3.Listar");
            System.out.println("4.Salir");

            int opcion = sc.nextInt();
            sc.nextLine(); // sirve para poder capturar las siguientes lineas linea de limpieza
            //Creo el switch para los casos
            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Nombre del producto: ");
                        String productName = sc.nextLine();
                        System.out.println("Cantidad del producto: ");
                        int productStock = sc.nextInt();
                        inventory.addProduct(new Product(productName, productStock));
                    }
                    case 2 -> {
                        System.out.println("Nombre del producto a vender: ");
                        String productName = sc.nextLine();
                        System.out.println("Cantidad del producto a vender: ");
                        int productStock = sc.nextInt();
                        inventory.sellProduct(productName, productStock);
                    }
                    case 3 -> inventory.showProducts();
                    case 4 -> salir = true;
                    default -> System.out.println("Comando no encontrado.");
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
