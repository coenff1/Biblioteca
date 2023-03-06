package dao;
import dto.Autor;
import dto.Libro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibroDAO {

    List<Libro> libros = new ArrayList<>();
    List<Autor> autores = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void agregarLibro() {
        int id=1;
        String titulo, categoria, editorial, apellido;
        int isbn, stock, aPublicacion, m, p=0;

        System.out.println("Ingrese los siguientes datos:");
        System.out.println("-- Título:");
        titulo=scan.next();
        System.out.println("-- Categoría:");
        categoria=scan.next();
        System.out.println("-- Editorial:");
        editorial=scan.next();
        System.out.println("-- ISBN:");
        isbn=scan.nextInt();
        System.out.println("-- Stock:");
        stock=scan.nextInt();
        System.out.println("-- Autor:");
        do{
            p++;
            System.out.println("-- Apellido Paterno:");
            apellido=scan.next();
            System.out.println("-- Año de publicación:");
            aPublicacion=scan.nextInt();
            autores.add(new Autor(p, apellido, aPublicacion));
            System.out.println("¿Desea ingresar otro autor?");
            System.out.println("1 - Aceptar   2 - Terminar");
            m=scan.nextInt();
        } while(m==1);
    }
    
    
    public void imprimirLibros(){
        for(int i=0; i<libros.size(); i++){
            System.out.println(libros.get(i)+ " Autor: "+ libros.get(i).getAutores());
        }
    }
    
    
    public void eliminarLibro(){
        int m;
        System.out.println("Ingrese la posición a eliminar");
        m=scan.nextInt();
        libros.remove(m);
    }
}