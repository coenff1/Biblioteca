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
        for(int i=0; i<profesores.size(); i++){
            System.out.println(profesores.get(i)+ " nombre(s): "+ profesores.get(i).getNombre()+ ",   apellido paterno: "+profesores.get(i).getApPaterno()+ ",   apellido materno: "+profesores.get(i).getApMaterno()+ ",   género: "+profesores.get(i).getGenero()+ ". ");
        }
    }

    public void eliminarProfesor(){
        int n;
        System.out.println("Ingrese la posición a eliminar: ");
        n=scan.nextInt();
        profesores.remove(n);
    }
}