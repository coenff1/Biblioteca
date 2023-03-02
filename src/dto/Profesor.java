package dto;

public class Profesor extends Persona {
    private int id;
    private int numEmpleado;

    public Profesor(int id, int numEmpleado) {
        this.id = id;
        this.numEmpleado = numEmpleado;
    }
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", numEmpleado=" + numEmpleado + '}';
    }
}