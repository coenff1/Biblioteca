package test;
import dto.Alumno;
import dto.Autor;
import dto.Libro;
import dto.Prestamo;
import dto.Profesor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestBibliotecadto {

    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        
        //Lista de autores
        List<Autor> autores = new ArrayList<>();
        
        //Libros solicitados.
        Libro libro1 = new Libro(1, "Ecuaciones Diferenciales", 968-7529-21-0, "Cálculo", "Thomson Editores", 5, autores);
        Libro libro2 = new Libro(2, "Precálculo", 978-0-8400-6807-1, "Cálculo", "Brooks & Cole", 6, autores);
        
        //Lista de libros solicitados
        List<Libro> p1 = new ArrayList<>();
        p1.add(libro1);
        p1.add(libro2);
        
        //Información del solicitante.
        Alumno alumno1 = new Alumno(1, 2227102);
        alumno1.setNombre("Diego");
        alumno1.setApPaterno("Hernández");
        alumno1.setApMaterno("Ruiz");
        alumno1.setGenero("Masculino");
        
        //Fechas
        Date fecInicio = new Date();
        Date fecEntrega = new Date();
        
        //Primer préstamo
        Prestamo prestamo1 = new Prestamo(1, 1, fecInicio, fecEntrega, p1, alumno1);
        
        //Segundo préstamo
        Libro libro3 = new Libro(3, "Álgebra lineal", 978-607-150760-0, "Matemáticas", "Mc Graw Hill", 3, autores);
        Libro libro4 = new Libro(4, "El Cálculo", 970-613-182-5, "Cálculo", "OXFORD UNIVERSITY PRESS", 4, autores);
        
        List<Libro> p2 = new ArrayList<>();
        p2.add(libro3);
        p2.add(libro4);
        
        Alumno alumno2 = new Alumno(2, 1817649);
        alumno2.setNombre("Laura");
        alumno2.setApPaterno("Herrera");
        alumno2.setApMaterno("Gonzalez");
        alumno2.setGenero("Femenino");
        
        Prestamo prestamo2 = new Prestamo(2, 2, fecInicio, fecEntrega, p2, alumno2);
        
        //Tercer préstamo con un profesor
        Profesor profesor1 = new Profesor(1, 80873);
        profesor1.setNombre("Angela");
        profesor1.setApPaterno("Ríos");
        profesor1.setApMaterno("Luna");
        profesor1.setGenero("Femenino");
        
        List<Libro> p3 = new ArrayList<>();
        p3.add(libro1);
        p3.add(libro4);
        
        Prestamo prestamo3 = new Prestamo(3, 3, fecInicio, fecEntrega, p3, profesor1);
        
        System.out.println(prestamo1);
        System.out.println(prestamo2);
        System.out.println(prestamo3);
    }
}