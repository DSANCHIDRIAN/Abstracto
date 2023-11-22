public class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    @Override
    public int compareTo(Estudiante otroEstudiante) {
        return Double.compare(this.promedio, otroEstudiante.promedio);
    }

    @Override
    public String toString() {
        return "Estudiante - Nombre: " + nombre + ", Edad: " + edad + ", Promedio: " + promedio;
    }
}