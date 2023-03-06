package test;
import dao.AlumnoDAO;
import dao.ProfesorDAO;
import dto.Alumno;
import dto.Profesor;
import java.util.ArrayList;
import java.util.List;

public class TestBibliotecadao {

    public static void main(String[] args) {
        
        List<Alumno> alumnos = new ArrayList<>();
        List<Profesor> profesores = new ArrayList<>();
        
        AlumnoDAO m = new AlumnoDAO();
        m.agregarAlumno();
        m.listaAlumnos();
        m.eliminarAlumno();
        
        ProfesorDAO n = new ProfesorDAO();
        n.listaProfesores();
    }
}