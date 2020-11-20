package lab5_jesúsmeraz;

public class Clases {

    private String Nombre;
    private String Seccion;
    private String Edificio;
    private String Salon;
    private String Aire_Acondicionado;

    public Clases(String Nombre, String Seccion, String Edificio, String Salon, String Aire_Acondicionado) {
        this.Nombre = Nombre;
        this.Seccion = Seccion;
        this.Edificio = Edificio;
        this.Salon = Salon;
        this.Aire_Acondicionado = Aire_Acondicionado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public String getEdificio() {
        return Edificio;
    }

    public void setEdificio(String Edificio) {
        this.Edificio = Edificio;
    }

    public String getSalon() {
        return Salon;
    }

    public void setSalon(String Salon) {
        this.Salon = Salon;
    }

    public String getAire_Acondicionado() {
        return Aire_Acondicionado;
    }

    public void setAire_Acondicionado(String Aire_Acondicionado) {
        this.Aire_Acondicionado = Aire_Acondicionado;
    }

    @Override
    public String toString() {
        return "Clases{" + "Nombre=" + Nombre + ", Seccion=" + Seccion + ", Edificio=" + Edificio + ", Salon=" + Salon + ", Aire_Acondicionado=" + Aire_Acondicionado + '}';
    }

}
