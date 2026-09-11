import java.util.HashMap;
import java.util.Map;

public class Inventory {
    //Creo el mapa que contiene el nombre y el producto.
    private Map<String,Product> products = new HashMap<>();
    //Creo un metodo para poder añadir productos usando product.getName() para saber el nombre.
    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }
    //Creo un metodo para buscar un producto.
    public Product findByName(String name) {
        // Devolvemos el valor (producto) de la clave con name y .get
        //return products.get(name);

        //
        Product holder = products.get(name);
        if (holder == null) {
            throw new ProductNotFoundException("El producto no existe.");
        }
        return holder;
    }

    //Creamos el metodo sellProduct("Nombre", cantidad a vender) primero lo buscamos y luego lo vendemos.
    public void sellProduct(String name, int quantity) {
        Product product = findByName(name); //puedo llamar directamente a findByName porque estoy dentro de inventory.
        product.sell(quantity);
    }

    //Creamos metodo showProducts
    public void showProducts() {
        for (String s : products.keySet()){
            products.get(s).describe();
        }
    }
}
