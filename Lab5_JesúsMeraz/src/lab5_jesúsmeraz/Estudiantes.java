package lab5_jesúsmeraz;

public class Estudiantes extends Persona {

    private int Numero_Cuenta;
    private String Carrera;
    
    public Estudiantes(int Numero_Cuenta, String Carrera, String Nombre, String Apellido, int Edad, String Genero) {
        super(Nombre, Apellido, Edad, Genero);
        this.Numero_Cuenta = Numero_Cuenta;
        this.Carrera = Carrera;
    }

    public int getNumero_Cuenta() {
        return Numero_Cuenta;
    }

    public void setNumero_Cuenta(int Numero_Cuenta) {
        this.Numero_Cuenta = Numero_Cuenta;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
