public class AnimalDomestico extends Animal{
    
    //Atributos propios de los animales domesticos
    protected String nivelSociabilidad;
    protected String tipoVivienda;
    protected boolean estaVacunado;
    protected String utilidadPrincipal; // Ejemplo: compañía, producción, carga

    //Método constructor de la subclase, con caracteristicas de clase padre mas caracteristicas propias
    public AnimalDomestico(String especie, int edad, int longevidadPromedio, double peso, String alimentacion,
            String habitat, String tipoReproduccion, String nivelSociabilidad, String tipoVivienda,
            boolean estaVacunado, String utilidadPrincipal) {

        super(especie, edad, longevidadPromedio, peso, alimentacion, habitat, tipoReproduccion);

        this.nivelSociabilidad = nivelSociabilidad;
        this.tipoVivienda = tipoVivienda;
        this.estaVacunado = estaVacunado;
        this.utilidadPrincipal = utilidadPrincipal;
    }

    //Metodos comportamientos Propios de animales domesticos
    public void interactuarConHumano(){
        System.out.println("El animal doméstico interactúa de forma amigable con el humano.");
    }

    public void recibirVacuna(){
        this.estaVacunado = true;
        System.out.println("El animal doméstico ha sido vacunado.");
    }

    public void producirRecursos(String recursoProducido){
        System.out.println("El animal doméstico produce: "+ recursoProducido);
    }

    public void recibirAlimento(){
        System.out.println("El animal es alimentado. ");
    }

}
