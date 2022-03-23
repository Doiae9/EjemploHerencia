import java.util.ArrayList;

//extends NombreClasePadre
//hijos atributos protegidos
//ultimo hijo, privado.
public class Monstruo extends Personaje {

    //tieneCuernos (True,false)
    //tieneTentaculos
    //color
    //habilidades
    private boolean tieneCuernos;
            private boolean tieneTentaculos;
                    private String color;
    private ArrayList<String> habilidades;

    public boolean isTieneCuernos() {
        return tieneCuernos;
    }

    public void setTieneCuernos(boolean tieneCuernos) {
        this.tieneCuernos = tieneCuernos;
    }

    public boolean isTieneTentaculos() {
        return tieneTentaculos;
    }

    public void setTieneTentaculos(boolean tieneTentaculos) {
        this.tieneTentaculos = tieneTentaculos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public Monstruo(String nombre, double estatura,
                    double peso, boolean tieneCuernos,
                    boolean tieneTentaculos, String color, ArrayList<String> habilidades) {
        super(nombre, estatura, peso);
        this.tieneCuernos = tieneCuernos;
        this.tieneTentaculos = tieneTentaculos;
        this.color = color;
        this.habilidades = habilidades;
        System.out.println("Soy el constructor hijo");
    }

    //espantar
    //trabajar
    //hacerReir
    public void espantar(){
        System.out.println("booo!");

    }
    public void trabajar(){
        System.out.println("Trabajando");
    }
    public void hacerReir(){
        System.out.println("El dia del payaso");
    }
}
