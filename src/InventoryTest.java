public class InventoryTest {
    public static void main() {
        //Creo el mapa con el constructor
        Inventory inventory = new Inventory();
        //Agrego productos con el metodo.
        inventory.addProduct(new Product("Apple", 5));
/*
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
    }
}
