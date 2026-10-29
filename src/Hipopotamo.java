public class Hipopotamo extends AnimalSalvaje implements IComportamientoEspecial {

    // Atributos propios y exclusivos del Hipopótamo
    private double fuerzaMordida; // En PSI o Newtons (o representación numérica)
    private boolean esAgresivoEnAgua;

    // Método Constructor con herencia acumulada (super) alineado con tu IDE
    public Hipopotamo(String especie, int edad, int longevidadPromedio, double peso, String alimentacion, String habitat,
                      String tipoReproduccion, String nivelPeligrosidad, String territori, String estadoConservacion,
                      double fuerzaMordida, boolean esAgresivoEnAgua) {

        super(especie, edad, longevidadPromedio, peso, alimentacion, habitat, tipoReproduccion, 
              nivelPeligrosidad, territori, estadoConservacion);

        this.fuerzaMordida = fuerzaMordida;
        this.esAgresivoEnAgua = esAgresivoEnAgua;
    }

    // 1. Implementación obligatoria del contrato de la Interfaz
    @Override 
    public void realizarAccionEspecial() {
        System.out.println("El hipopótamo realiza una acción especial: ¡Se sumerge completamente bajo el agua y emerge lanzando un potente chorro!");
    }

    // 2. Métodos propios y únicos del Hipopótamo
    public void abrirFauces() {
        System.out.println("El hipopótamo abre sus enormes fauces para demostrar su dominancia en el río.");
    }

    public void marcarTerritorio() {
        System.out.println("El hipopótamo gira su cola rápidamente para esparcir marcas de olor y delimitar su territorio.");
    }

    // 3. Polimorfismo: Sobrescritura del método heredado de Animal
    @Override
    public void hacerSonido() {
        System.out.println("El hipopótamo emite un bufido estruendoso o un gruñido profundo.");
    }
}