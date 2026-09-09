public class InventoryTest {
    public static void main() {
        //Creo el mapa con el constructor
        Inventory inventory = new Inventory();
        //Agrego productos con el metodo.
        inventory.addProduct(new Product("Apple", 5));

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
    }
}
