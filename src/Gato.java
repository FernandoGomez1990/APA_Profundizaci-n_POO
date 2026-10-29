public class Gato extends AnimalDomestico implements IComportamientoEspecial{
    //Atributos propioes de los gatos
    private boolean independiente; 
    private int numeroDeVidas;
    
    //Método Constructor de la clase Gato
    public Gato(String especie, int edad, int longevidadPromedio, double peso, String alimentacion, String habitat,
            String tipoReproduccion, String nivelSociabilidad, String tipoVivienda, boolean estaVacunado,
            String utilidadPrincipal, boolean independiente, int numeroDeVidas) {

        super(especie, edad, longevidadPromedio, peso, alimentacion, habitat, tipoReproduccion, nivelSociabilidad,
                tipoVivienda, estaVacunado, utilidadPrincipal);

        this.independiente = independiente;
        this.numeroDeVidas = numeroDeVidas;
    }

    // Implementación obligatoria del contrato de la Interfaz
    @Override 
    public void realizarAccionEspecial(){
        System.out.println("El Gato ve en la oscuridad");
    }
    
    //Métodos propios y únicos del Gato
    public void ronronear() {
        System.out.println("El gato ronronea suavemente demostrando tranquilidad.");
    }

    public void rasguñarMueble() {
        System.out.println("El gato afila sus uñas rascando la superficie del sofá.");
    }

    // Polimorfismo: Sobrescritura del método heredado de Animal
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau, miau!");
    }
        
}
