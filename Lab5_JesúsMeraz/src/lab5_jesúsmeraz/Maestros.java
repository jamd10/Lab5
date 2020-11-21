package lab5_jesúsmeraz;

import java.util.ArrayList;

public class Maestros extends Persona {

    private int Salario;
    private ArrayList clase = new ArrayList();

    public Maestros(int Salario, String Nombre, String Apellido, int Edad, String Genero) {
        super(Nombre, Apellido, Edad, Genero);
        this.Salario = Salario;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public ArrayList getClase() {
        return clase;
    }

    public void setClase(ArrayList clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return super.toString() + ' ' + Salario + ' ' + clase;
    }

}
