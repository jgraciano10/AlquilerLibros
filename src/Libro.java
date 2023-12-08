public class Libro {
    private String titulo = "Harry Potter";

    private String isbn= "9780545582889";
    private String  autor = "Rowling, J.K";

    private boolean isRent= false;

    public Libro() {
    }

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isRent() {
        return isRent;
    }

    public void prestamo(){
        if(!this.isRent){
            System.out.println("Libro "+ this.titulo+ " prestado con exito");
            this.isRent = true;
        }else{
            System.out.println("El libro "+this.titulo+" Ya se escuentra prestado, por tanto no se puede prestar dos veces al mismo tiempo");
        }

    }
    public void devolucion(){
        if(!this.isRent){
            System.out.println("El libro no se encuntra prestado, por tanto no se puede llevar a cabo el proceso de retorno");
        }else{
            System.out.println("Libro "+this.titulo+ " retornado con exito");
            this.isRent = false;
        }
    }

    @Override
    public String toString() {
        return "Libro " +
                this.titulo + '\'' +
                ", con isbn " + isbn + '\'' +
                " y de autor " + autor;
    }
}
