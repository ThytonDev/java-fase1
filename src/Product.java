public class Product {

    private String name;
    private int stock;

    //Getter, Setter Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Getter, Setter Stock
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    //Constructor
    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    //Metodo vender
    public void sell(int quantity) {
        if (quantity > this.stock) {
            throw new InsufficientStockException("No tienes el suficiente stock para vender.");
        } else {
            this.stock = this.stock - quantity;
        }
    }

    //Metodo describir
    public void describe() {
        System.out.println(this.getName() + " con un stock de: " + this.getStock());
    }

}
