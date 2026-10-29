import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Instanciamos Scaner para capurar informacion por teclado 
        Scanner sc = new Scanner(System.in);

        //Instanciamos un anuimal domestico 
        Perro kira = new Perro("Canino",6,15,
        14,"Concentrado","Hogar","Gestación",
        "Alto","Casa",true,"Compañia","Criolla",false);

        System.out.println("====================Métodos de clase Animal ====================\n");
        //Acciones o métodos de Animal 
        kira.nacer();
        kira.crecer();
        kira.hacerSonido();
        kira.alimentarse();

        System.out.println("====================Métodos de clase Animal Domestico====================\n");
        //Acciones o métodos de AnimaDomestico
        kira.interactuarConHumano();
        kira.recibirAlimento();

        System.out.println("====================Métodos de clase Perro====================\n");
        //Acciones o metodos de Clase Perro 
        kira.moverLaCola();
        kira.realizarAccionEspecial();

        //Instanciamos un anuimal domestico 
        Vaca lola = new Vaca("Semovient",2,10,500,
        "Forraje","Rural","Gestación","Alto",
        "Fincas",true,"Produce leche",30,true);

        System.out.println("====================Métodos de clase Animal ====================\n");
        //Acciones o métodos de Animal 
        lola.nacer();
        lola.crecer();
        lola.hacerSonido();
        lola.alimentarse();

        System.out.println("====================Métodos de clase Animal Domestico====================\n");
        //Acciones o métodos de AnimaDomestico
        lola.interactuarConHumano();
        lola.recibirAlimento();
        System.out.print("Indique el lrecurso que le provee el animal: ");
        lola.producirRecursos(sc.next());

        System.out.println("====================Métodos de clase Vaca====================\n");
        //Acciones o metodos de Clase Vaca
        lola.producirLeche();
        lola.realizarAccionEspecial();

        //Instanciamos un anuimal Salvaje
        Cocodrilo dientes = new Cocodrilo("Cocodrilo",3,20,
        1000,"Carnivoro","Rios","Oviparo","Alto",
        "Cerca de Rios","No",4,false);

        System.out.println("====================Métodos de clase Animal ====================\n");
        //Acciones o métodos de Animal 
        dientes.nacer();
        dientes.crecer();
        dientes.hacerSonido();
        dientes.alimentarse();

        System.out.println("====================Métodos de clase Animal Salvaje====================\n");
        //Acciones o métodos de AnimaSalvaje
        dientes.cazar();
        dientes.defenderTerritori();
        dientes.migrar();

        System.out.println("====================Métodos de clase Cocodrilo====================\n");
        //Acciones o metodos de Clase Cocodrilo
        dientes.realizarAccionEspecial();
        dientes.camuflarEnSuperficie();
        dientes.asolearse();


    }
}
