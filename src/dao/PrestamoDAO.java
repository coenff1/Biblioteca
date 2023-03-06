package dao;
import dto.Alumno;
import dto.Autor;
import dto.Libro;
import dto.Persona;
import dto.Prestamo;
import dto.Profesor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PrestamoDAO {
    List<Prestamo> prestamos = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    
    public void agregarPrestamo(){
        int id=0, folio=0, m, d=0, isbn;
        Date fechaInicio = new Date();
        Date fechaEntrega = new Date();
        String nombre, apPaterno, apMaterno, genero, titulo, categoria, editorial;
        Persona persona;
        List<Libro> libros= new ArrayList<>();
        List<Autor> autores= new ArrayList<>();
        
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("-- Titulo:");
        titulo=scan.next();
        System.out.println("-- Categoría:");
        categoria=scan.next();
        System.out.println("-- Editorial:");
        editorial=scan.next();
        System.out.println("-- ISBN:");
        
        isbn=scan.nextInt();
        System.out.println("-- Nombre(s):");
        nombre= scan.next();
        System.out.println("-- Apellido Paterno:");
        apPaterno= scan.next();
        System.out.println("-- Apellido Materno:");
        apMaterno= scan.next();
        
        System.out.println("Ingrese 1 si se trata de un Alumno o 2 si se trata de un Profesor:");
        m=scan.nextInt();
        if(m==1){
            int numCuenta;
            System.out.println("Ingrese el número de cuenta:");
            numCuenta=scan.nextInt();
            Alumno alumno = new Alumno(id, numCuenta);
            alumno.setNombre(nombre);
            alumno.setApPaterno(apPaterno);
            alumno.setApMaterno(apMaterno);
            Prestamo prestamo = new Prestamo(id, folio, fechaInicio, fechaEntrega, libros, alumno);
        } else{
            int numEmpleado;
            System.out.println("Ingrese el número de empleado");
            numEmpleado=scan.nextInt();
            Profesor profesor = new Profesor(id, numEmpleado);
            profesor.setNombre(nombre);
            profesor.setApPaterno(apPaterno);
            profesor.setApMaterno(apMaterno);
            Prestamo prestamo = new Prestamo(id, folio, fechaInicio, fechaEntrega, libros, profesor);
        }
    }
    
}