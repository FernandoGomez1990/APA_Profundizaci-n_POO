public class Perro extends AnimalDomestico implements IComportamientoEspecial{

    //Atributos de los perros
    private String raza;
    private  boolean adiestrado;

    //Método Constructor con herencia 
    public Perro(String especie, int edad, int longevidadPromedio, double peso, String alimentacion, String habitat,
            String tipoReproduccion, String nivelSociabilidad, String tipoVivienda, boolean estaVacunado,
            String utilidadPrincipal, String raza, boolean adiestrado) {

        super(especie, edad, longevidadPromedio, peso, alimentacion, habitat, tipoReproduccion, nivelSociabilidad,
                tipoVivienda, estaVacunado, utilidadPrincipal);

        this.raza = raza;
        this.adiestrado = adiestrado;
    }

    @Override 
    public void realizarAccionEspecial(){
        System.out.println("El perro realiza un truco especial: ¡Da la pata y obedece la orden!");
    }

    public void moverLaCola(){
        System.out.println("El perro mueve la cola alegremente al ver a sus dueños.");
    }

    public void cuidarDueño(){
        System.out.println("El perro cuida a sus dueños.");
    }

    //Realizamos polimorfismo de Animal.hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }

}
