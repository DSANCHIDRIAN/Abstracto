public class Rectangulo extends Figura {
    private double longitud;
    private double ancho;

    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    double calcularArea() {
        return longitud * ancho;
    }
    public void imprimirDetalles() {
        System.out.println("Rectángulo - Longitud: " + longitud + ", Ancho: " + ancho);
    }
}
