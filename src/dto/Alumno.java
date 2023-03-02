package dto;

public class Alumno extends Persona {
    private int id;
    private int numCuenta;

    public Alumno(int id, int numCuenta) {
        this.id = id;
        this.numCuenta = numCuenta;
    }
    
    @Override
    public int getId() {
        return id;
    }

    public Alumno() {
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", numCuenta=" + numCuenta + '}';
    }
    
}