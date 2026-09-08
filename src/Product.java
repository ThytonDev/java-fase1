public class Product {

    String name;
    int stock;

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

}
