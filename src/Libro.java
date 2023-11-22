class Libro implements Prestable, Imprimible {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean prestado;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false;
    }

    @Override
    public String toString() {
        return "Libro - Título: " + titulo + ", Autor: " + autor + ", Año de Publicación: " + anioPublicacion +
               ", Prestado: " + (prestado ? "Sí" : "No");
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' no estaba prestado.");
        }
    }

    @Override
    public void imprimirDetalles() {
        System.out.println(this);
    }
}