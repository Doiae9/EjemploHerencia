public class Kid extends Personaje{

    //colorPuerta
    private String colorPuerta;
    //reir
    //llorar

    public String getColorPuerta() {
        return colorPuerta;
    }

    public void setColorPuerta(String colorPuerta) {
        this.colorPuerta = colorPuerta;
    }

    public Kid(String nombre, double estatura, double peso, String colorPuerta) {
        super(nombre, estatura, peso);
        this.colorPuerta = colorPuerta;
        System.out.println("Estoy en el constructor de Kid");
    }

    public void reir(){System.out.println("hahaha");}
    public void llorar(){System.out.println("Buaahh!");}


}
