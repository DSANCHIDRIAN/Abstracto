public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    public void imprimirDetalles() {
        System.out.println("Círculo - Radio: " + radio);
    }
}