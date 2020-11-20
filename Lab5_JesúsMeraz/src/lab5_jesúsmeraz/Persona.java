package lab5_jesúsmeraz;

public class Persona {

    String Nombre;
    private String Apellido;
    private int Edad;
    private String Genero;

    public Persona(String Nombre, String Apellido, int Edad, String Genero) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Genero = Genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return Nombre + ' ' + Apellido + ' ' + Edad + ' ' + Genero;
    }
}
