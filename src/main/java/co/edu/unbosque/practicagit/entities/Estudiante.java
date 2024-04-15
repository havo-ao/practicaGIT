package co.edu.unbosque.practicagit.entities;

public class Estudiante {

    private String nombre, cedula, programa;

    public Estudiante(String nombre, String cedula, String programa) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
}
