public class Cocodrilo extends AnimalSalvaje implements IComportamientoEspecial {

    // Atributos propios y exclusivos del Cocodrilo
    private double longitudMetros;
    private boolean esAguaSalada;

    // Método Constructor con herencia acumulada (super) basado en tu IDE
    public Cocodrilo(String especie, int edad, int longevidadPromedio, double peso, String alimentacion, String habitat,
                     String tipoReproduccion, String nivelPeligrosidad, String territori, String estadoConservacion,
                     double longitudMetros, boolean esAguaSalada) {

        super(especie, edad, longevidadPromedio, peso, alimentacion, habitat, tipoReproduccion, 
              nivelPeligrosidad, territori, estadoConservacion);

        this.longitudMetros = longitudMetros;
        this.esAguaSalada = esAguaSalada;
    }

    // 1. Implementación obligatoria del contrato de la Interfaz
    @Override 
    public void realizarAccionEspecial() {
        System.out.println("El cocodrilo realiza una acción especial: ¡Ejecuta un rápido giro mortal (death roll) bajo el agua para someter a su presa!");
    }

    // 2. Métodos propios y únicos del Cocodrilo
    public void camuflarEnSuperficie() {
        System.out.println("El cocodrilo flota sigilosamente dejando visibles únicamente sus ojos y fosas nasales.");
    }

    public void asolearse() {
        System.out.println("El cocodrilo permanece inmóvil en la orilla con las fauces abiertas para regular su temperatura corporal.");
    }

    // 3. Polimorfismo: Sobrescritura del método heredado de Animal
    @Override
    public void hacerSonido() {
        System.out.println("El cocodrilo emite un bramido o rugido gutural de baja frecuencia.");
    }
}