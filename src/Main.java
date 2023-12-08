public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.prestamo();
        libro1.prestamo();
        libro1.devolucion();
        libro1.devolucion();
        System.out.println(libro1);
    }
}