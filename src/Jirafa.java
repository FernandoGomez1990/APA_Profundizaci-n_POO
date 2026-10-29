public class Jirafa extends AnimalSalvaje implements IComportamientoEspecial {

    // Atributos propios y exclusivos de la Jirafa
    private double alturaTotal; // En metros
    private String patronManchas;

    // Método Constructor con herencia acumulada (super)
    public Jirafa(String especie, int edad, int longevidadPromedio, double peso, String alimentacion, String habitat,
            String tipoReproduccion, String nivelPeligrosidad, String territori, String estadoConservacion,
            double alturaTotal, String patronManchas) {

        super(especie, edad, longevidadPromedio, peso, alimentacion, habitat, tipoReproduccion, nivelPeligrosidad,
                territori, estadoConservacion);
                
        this.alturaTotal = alturaTotal;
        this.patronManchas = patronManchas;
    }

    // 1. Implementación obligatoria del contrato de la Interfaz
    @Override 
    public void realizarAccionEspecial() {
        System.out.println("La jirafa realiza una acción especial: ¡Estira su largo cuello para alcanzar las hojas más altas de la acacia!");
    }

    
    // 2. Métodos propios y únicos de la Jirafa
    public void usarCuelloParaLucha() {
        System.out.println("La jirafa utiliza su cuello en un duelo defensivo (necking) para establecer jerarquía.");
    }

    public void beberAguaConPrecaución() {
        System.out.println("La jirafa abre sus patas delanteras con dificultad para inclinarse y beber agua de la charca.");
    }

    // 3. Polimorfismo: Sobrescritura del método heredado de Animal
    @Override
    public void hacerSonido() {
        System.out.println("La jirafa emite un sonido muy sordo, casi imperceptible, o un leve ronquido.");
    }
}