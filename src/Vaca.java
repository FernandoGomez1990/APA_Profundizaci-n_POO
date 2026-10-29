public class Vaca extends AnimalDomestico implements IComportamientoEspecial {

    // Atributos propios y exclusivos de la Vaca
    private double produccionLecheDiaria; // En litros
    private boolean aptaParaOrdeño;

    // Método Constructor con herencia acumulada (super)
    public Vaca(String especie, int edad, int longevidadPromedio, double peso, String alimentacion, String habitat,
                String tipoReproduccion, String nivelSociabilidad, String tipoVivienda, boolean estaVacunado,
                String utilidadPrincipal, double produccionLecheDiaria, boolean aptaParaOrdeño) {

        super(especie, edad, longevidadPromedio, peso, alimentacion, habitat, tipoReproduccion, nivelSociabilidad,
                tipoVivienda, estaVacunado, utilidadPrincipal);

        this.produccionLecheDiaria = produccionLecheDiaria;
        this.aptaParaOrdeño = aptaParaOrdeño;
    }

    //Implementación obligatoria del contrato de la Interfaz
    @Override 
    public void realizarAccionEspecial() {
        System.out.println("La vaca realiza una acción especial: ¡Pacer tranquilamente en el prado y rumiar el alimento!");
    }

    //Métodos propios y únicos de la Vaca
    public void producirLeche() {
        System.out.println("La vaca ha generado " + this.produccionLecheDiaria + " litros de leche frescos para el ordeño.");
    }

    public void espantarMoscasConLaColas() {
        System.out.println("La vaca utiliza su cola para espantar los insectos del potrero.");
    }

    //Polimorfismo: Sobrescritura del método heredado de Animal
    @Override
    public void hacerSonido() {
        System.out.println("La vaca muge");
    }
}