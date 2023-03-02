package dao;
import dto.Profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProfesorDAO {
    List<Profesor> profesores = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    
    public void agregarProfesor (){
        int id = 1;
        int numEmpleado;
        String nombre, apPaterno, apMaterno, genero;

        System.out.println("Ingrese los siguientes datos: ");
        System.out.println("--- Número de empleado: ");
        numEmpleado = scan.nextInt();
        System.out.println("--- Nombre(s): ");
        nombre = scan.next();
        System.out.println("--- Apellido Paterno: ");
        apPaterno = scan.next();
        System.out.println("--- Apellido Materno ");
        apMaterno = scan.next();
        System.out.println("--- Genero: ");
        genero = scan.next();
        
        Profesor m = new Profesor(id, numEmpleado);
        m.setNombre(nombre);
        m.setApPaterno(apPaterno);
        m.setApMaterno(apMaterno);
        m.setGenero(genero);
        
        profesores.add(m);
        id++;
    }
    
    
    public void listaProfesores(){
        
    }
}
