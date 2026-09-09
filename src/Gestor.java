public class Gestor {
    public static void main() {
        Product apple = new Product("Apple", 5);

        //Metodo try/catch
        try {
            apple.sell(10);
            System.out.println("Venta realizada con exito.");
        } catch (IllegalArgumentException e) {
            System.out.println("No se pudo vender: " + e.getMessage());
        } finally {
            System.out.println("Intento de venta finalizado (Finnaly)");
        }
        System.out.println("Esto va despues del try/catch/finnaly");

        System.out.println("El programa sigue vivo");
        System.out.println(apple.getStock());

        try {
            apple.sell(3);
            System.out.println("La venta se realizo con exito");
        } catch (IllegalArgumentException e) {
            System.out.println("No se pudo vender: " + e.getMessage());
        }
        System.out.println(apple.getStock());
    }
}
