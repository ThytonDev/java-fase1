//Excepcion propia para cuando se intenta vender más stock que el disponible.
//Hereda del RuntimeException, por eso sera "unchecked"
public class InsufficientStockException extends RuntimeException {

    //Constructor: Recibe el mensaje y se lo entrega a la clase padre.
    public InsufficientStockException(String message) {
        super(message);
    }
}
