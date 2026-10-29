public class Animal {

    //Atributos de la clase animal según investigue deben ser protected para que pueda acceder a ellos desde las subclases
    protected String especie;
    protected int edad;
    protected int longevidadPromedio;
    protected double peso;
    protected String alimentacion;
    protected String habitat;
    protected String tipoReproduccion;
    
    //Creación de método constructor
    public Animal(String especie, int edad, int longevidadPromedio, double peso, 
        String alimentacion, String habitat,String tipoReproduccion) {
        this.especie = especie;
        this.edad = edad;
        this.longevidadPromedio = longevidadPromedio;
        this.peso = peso;
        this.alimentacion = alimentacion;
        this.habitat = habitat;
        this.tipoReproduccion = tipoReproduccion;
    }
    
    // Metodos generales
    public void nacer() {
        System.out.println("El animal ha nacido.");
    }

    public void crecer() {
        System.out.println("El animal esta creciendo.");
    }

    public void reproducirse() {
        System.out.println("El animal se esta reproduciendo por: " + tipoReproduccion);
    }

    public void alimentarse() {
        System.out.println("El animal se alimenta de: " + alimentacion);
    }

    public void desplazarse() {
        System.out.println("El animal se esta desplazando en su habitat: " + habitat);
    }

    // Metodo candidato para Polimorfismo
    public void hacerSonido() {
        System.out.println("El animal emite un sonido generico.");
    }

    public void morir() {
        System.out.println("El ciclo vital del animal ha finalizado.");
    }

}
