package lab5_jesúsmeraz;

public class Carrera {

    private String Nombre;
    private String Facultad;
    private int Costo_Mensual;
    private String Jefe_Carrera;

    public Carrera(String Nombre, String Facultad, int Costo_Mensual, String Jefe_Carrera) {
        this.Nombre = Nombre;
        this.Facultad = Facultad;
        this.Costo_Mensual = Costo_Mensual;
        this.Jefe_Carrera = Jefe_Carrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    public int getCosto_Mensual() {
        return Costo_Mensual;
    }

    public void setCosto_Mensual(int Costo_Mensual) {
        this.Costo_Mensual = Costo_Mensual;
    }

    public String getJefe_Carrera() {
        return Jefe_Carrera;
    }

    public void setJefe_Carrera(String Jefe_Carrera) {
        this.Jefe_Carrera = Jefe_Carrera;
    }

    @Override
    public String toString() {
        return Nombre + " " + Facultad + " " + Costo_Mensual + " " + Jefe_Carrera + '}';
    }

}
