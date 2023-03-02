package dto;

public class Autor extends Persona {
    private int id;
    private String apellido;
    private int aPublicacion;

    public Autor(int id, String apellido, int aPublicacion) {
        this.id = id;
        this.apellido = apellido;
        this.aPublicacion = aPublicacion;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getaPublicacion() {
        return aPublicacion;
    }

    public void setaPublicacion(int aPublicacion) {
        this.aPublicacion = aPublicacion;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", apellido=" + apellido + ", añoPublicacion=" + aPublicacion + '}';
    }
}