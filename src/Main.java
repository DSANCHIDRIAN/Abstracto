import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954));
        listaLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        listaLibros.add(new Libro("1984", "George Orwell", 1949));
        
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(new Estudiante("Juan", 20, 8.5));
        listaEstudiantes.add(new Estudiante("Maria", 22, 7.8));
        listaEstudiantes.add(new Estudiante("Pedro", 21, 9.2));
        
        List<Prestable> listaPrestables = new ArrayList<>();
        listaPrestables.add(new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954));
        listaPrestables.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        listaPrestables.add(new Libro("1984", "George Orwell", 1949));

        do {
        	System.out.println("Menu:");
            System.out.println("1. Ejercicio 1: Clase Figura");
            System.out.println("2. Ejercicio 2: Interfaz Imprimible");
            System.out.println("3. Ejercicio 3: Uso de la Clase Object");
            System.out.println("4. Ejercicio 4: Clase Estudiante y Comparador");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
            case 1:
                Ejercicio1();
                break;
            case 2:
                Ejercicio2();
                break;
                
            case 3:
                Ejercicio3(listaLibros);
                break;
            case 4:
                Ejercicio4(listaEstudiantes);
                break;
            case 5:
                Ejercicio5(listaPrestables);
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    } while (opcion != 0);
}

    private static void Ejercicio1() {
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
    private static void Ejercicio2() {
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);

        circulo.imprimirDetalles();
        rectangulo.imprimirDetalles();
    }
    
    private static void Ejercicio3(List<Libro> listaLibros) {
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }
    private static void Ejercicio4(List<Estudiante> listaEstudiantes) {
        Collections.sort(listaEstudiantes);

        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante);
        }
    }
    private static void Ejercicio5(List<Prestable> listaPrestables) {
        for (Prestable prestable : listaPrestables) {
            if (prestable instanceof Libro) {
                Libro libro = (Libro) prestable;
                libro.prestar();
                libro.devolver();
            }
        }
    }
}