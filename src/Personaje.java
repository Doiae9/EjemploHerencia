public class Personaje {
    //nombre
    //estatura
    //peso
    protected String nombre;
    protected double estatura;
    protected double peso;

    public Personaje(String nombre, double estatura, double peso) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        System.out.println("estoy en el constructor padre");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //comer
    //dormir
    //pensar

    public void comer(){
        System.out.println("Comiendo");
    }
    public void dormir(){
        System.out.println("Durmiendo");
    }
    public void pensar(){
        System.out.println("Pensando");
    }

}
