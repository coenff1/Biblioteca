package dao;
import dto.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoDAO {
    Scanner scan = new Scanner(System.in);
    List<Alumno> alumnos = new ArrayList<>();
    
    public void agregarAlumno() {
        int id = 1;
        int numCuenta;
        String nombre, apPaterno, apMaterno, genero;

        System.out.println("Ingrese los siguientes datos: ");
        System.out.println("--- Número de cuenta: ");
        numCuenta = scan.nextInt();
        System.out.println("--- Nombre(s): ");
        nombre = scan.next();
        System.out.println("--- Apellido Paterno: ");
        apPaterno = scan.next();
        System.out.println("--- Apellido Materno ");
        apMaterno = scan.next();
        System.out.println("--- Genero: ");
        genero = scan.next();
        
        Alumno n = new Alumno(id, numCuenta);
        n.setNombre(nombre);
        n.setApPaterno(apPaterno);
        n.setApMaterno(apMaterno);
        n.setGenero(genero);
        
        alumnos.add(n);
        id++;
    }
    
    
    public void listaAlumnos() {
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i)+ " nombre(s): "+ alumnos.get(i).getNombre()+ ",   apellido paterno: "+alumnos.get(i).getApPaterno()+ ",   apellido materno: "+alumnos.get(i).getApMaterno()+ ",   género: "+alumnos.get(i).getGenero()+ ". ");
        }
    }
    
    
    public void eliminarAlumno(){
        int p;
        System.out.println("Número del alumno a eliminar");
        p=scan.nextInt();
        alumnos.remove(p);
    }
}
