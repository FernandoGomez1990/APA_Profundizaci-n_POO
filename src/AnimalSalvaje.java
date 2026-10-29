public class AnimalSalvaje extends Animal{

    //Atributos de animales salvajes
    protected String nivelPeligrosidad;
    protected String territori;
    protected String estadoConservacion; //Identificar si esta en peligro de extinción
    
    //Método constructor de subclase con herencia de superclase
    public AnimalSalvaje(String especie, int edad, int longevidadPromedio, double peso, String alimentacion,
            String habitat, String tipoReproduccion, String nivelPeligrosidad, String territori,
            String estadoConservacion) {

        super(especie, edad, longevidadPromedio, peso, alimentacion, habitat, tipoReproduccion);

        this.nivelPeligrosidad = nivelPeligrosidad;
        this.territori = territori;
        this.estadoConservacion = estadoConservacion;
    }

    //Métodos propios de la subclase
    public void cazar(){
        System.out.println("El animal salvaje caza activamente para obtener su alimento en libertad.");
    }

    public void defenderTerritori(){
        System.out.println("El animal salvaje defiende su territorio frente a intrusos o depredadores.");
    }
    
    public void migrar(){
        System.out.println("El animal salvaje emprende una migración estacional en busca de recursos o mejor clima.");
    }

}
