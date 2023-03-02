package test;
import dao.AlumnoDAO;
import dto.Alumno;
import java.util.ArrayList;
import java.util.List;

public class TestBibliotecadao {

    public static void main(String[] args) {
        
        List<Alumno> alumnos = new ArrayList<>();
        AlumnoDAO m = new AlumnoDAO();
        m.agAlumno();
        m.listaAlumnos();
    }
}