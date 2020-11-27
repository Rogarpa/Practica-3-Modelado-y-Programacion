import java.util.*;

public class Menus{

    /**
    *Metodo para desplegar menu de Bienvenida.
    */
    public void desplegarMenuBienvenida(){
        int indice = 0;
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////Bienvenido al servicio de diseño de autos/////////////////////////////////////////////////");
        do {
            System.out.println("0.-Salir");
            System.out.println("1.-Comenzar presupuesto");

            indice = getint("Digite el numero de la opcion y presione enter:","No es un numero valido.", 0, 1);
            switch(indice){
                case 0:
                break;
                case 1:
                desplegarMenuPresupuesto();
                default:
                break;
            }

            System.out.println("**************************************************************************************************************************");
            System.out.println("**************************************************************************************************************************");
            System.out.println("**************************************************************************************************************************");
            System.out.println("**************************************************************************************************************************");
        } while (indice != 0);
    }

    public void desplegarMenuPresupuesto(){
        int indice=0;
        int dinero = 0;
        AutoMadMax presupuestado = null;
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////Bienvenido al presupuestador/////////////////////////////////////////////////");

        System.out.println("Digite su cantidad de dinero disponible para el auto");

        dinero = getint("Digite su cantidad y presione enter:","Entrada invalida.");


        System.out.println("0.-Escoger diseño fijos de Mad Max");
        System.out.println("1.-Escoger diseño personalizado inspirado en Mad Max");

        indice = getint("Digite el numero de la opcion y presione enter:","No es un numero valido.", 0, 1);
        switch(indice){
            case 0:
            presupuestado = desplegarMenuDiseñoFijo();
            break;
            case 1:
            presupuestado = desplegarMenuDiseñoPersonalizado();
            default:
            break;
        }

        System.out.println("\n\n");
        System.out.println("El auto escogido fue el siguiente :");
        System.out.println(presupuestado.getDescripcion());

        if(presupuestado.getCosto() > dinero)
            System.out.println("El auto que escogió excede su presupuesto de $" + dinero);

    }

    /**
    *Menu para desplegar,cuando el usuario quiera usar algun auto predefinido.
    */
    public AutoMadMax desplegarMenuDiseñoFijo(){
        int indice=0;
        BuilderAutosMadMax builderDeAutosMadMax = new BuilderAutosMadMax();

        Director constructorDiseñosPredeterminados = new Director(builderDeAutosMadMax);

        int dinero = 0;
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////Bienvenido al muestrario de diseños fijos de autos de Mad Max/////////////////////////////////////////////////");

        System.out.println("0.-The Ripper");
        System.out.println("1.-The Furnace");
        System.out.println("2.-The DieRolla");
        System.out.println("3.-The DeathRattle");
        indice = getint("Digite el numero de la opcion y presione enter:","No es un numero valido.", 0, 3);
        switch(indice){
            case 0:
            constructorDiseñosPredeterminados.theRipper();
            case 1:
            constructorDiseñosPredeterminados.theFurnace();
            break;
            case 2:
            constructorDiseñosPredeterminados.theDieRolla();
            break;
            case 3:
            constructorDiseñosPredeterminados.theDeathRattle();
            break;
            default:
            break;
        }
        return builderDeAutosMadMax.getAutoMadMax();

    }

    /*
    *Menu que se despliega cuando el usuario quiere personalizar su propio coche.
    */
    public AutoMadMax desplegarMenuDiseñoPersonalizado(){
        int indice=0;
        BuilderAutosMadMax builderDeAutosMadMax = new BuilderAutosMadMax();

        int dinero = 0;
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////Bienvenido al diseñador de autos de Mad Max personalizados/////////////////////////////////////////////////");


        System.out.println("0.-");
        System.out.println("1.-");
        System.out.println("2.-");
        System.out.println("3.-");
        System.out.println("4.-");
        System.out.println("5.-");
        System.out.println("6.-");

        System.out.println("0.-");
        System.out.println("1.-");
        System.out.println("2.-");
        System.out.println("3.-");
        indice = getint("Digite el numero de la opcion y presione enter:","No es un numero valido.", 0, 3);

        switch(indice){
            case 0:
            builderDeAutosMadMax.escogerLlantas(new LlantasSimple());
            break;
            case 1:
            builderDeAutosMadMax.escogerLlantas(new LlantasDeportiva());
            case 2:
            builderDeAutosMadMax.escogerLlantas(new LlantasOffRoad());
            break;
            case 3:
            builderDeAutosMadMax.escogerLlantas(new LlantasOrugaDeTanque());
            break;

            default:
            break;
        }

        System.out.println("0.-");
        System.out.println("1.-");
        System.out.println("2.-");
        indice = getint("Digite el numero de la opcion y presione enter:","No es un numero valido.", 0, 2);

        switch(indice){
            case 0:
            builderDeAutosMadMax.escogerMotor(new MotorDeportivo());
            break;
            case 1:
            builderDeAutosMadMax.escogerMotor(new MotorDiesel());
            case 2:
            builderDeAutosMadMax.escogerMotor(new MotorTurbo());
            break;
            default:
            break;
        }

        System.out.println("0.-");
        System.out.println("1.-");
        System.out.println("2.-");
        indice = getint("Digite el numero de la opcion y presione enter:","No es un numero valido.", 0, 2);

        switch(indice){
            case 0:
            builderDeAutosMadMax.escogerCarroceria(new CarroceriaCasual());
            break;
            case 1:
            builderDeAutosMadMax.escogerCarroceria(new CarroceriaCamion());
            case 2:
            builderDeAutosMadMax.escogerCarroceria(new CarroceriaDeportiva());
            break;
            default:
            break;
        }

        System.out.println("0.-");
        System.out.println("1.-");
        System.out.println("2.-");
        indice = getint("Digite el numero de la opcion y presione enter:","No es un numero valido.", 0, 2);

        switch(indice){
            case 0:
            builderDeAutosMadMax.escogerBlindaje(new BlindajeSimple());
            break;
            case 1:
            builderDeAutosMadMax.escogerBlindaje(new BlindajeReforzado());
            case 2:
            builderDeAutosMadMax.escogerBlindaje(new BlindajeTanque());
            break;
            default:
            break;
        }

        System.out.println("0.-");
        System.out.println("1.-");
        System.out.println("2.-");
        System.out.println("3.-");
        System.out.println("4.-");
        System.out.println("5.-");
        indice = getint("Digite el numero de la opcion y presione enter:","No es un numero valido.", 0, 5);

        switch(indice){
            case 0:
            builderDeAutosMadMax.escogerArmas(new ArmasArpones());
            break;
            case 1:
            case 2:
            builderDeAutosMadMax.escogerArmas(new ArmasArpones());
            break;
            case 3:
            builderDeAutosMadMax.escogerArmas(new ArmasCanones());
            break;
            case 4:
            builderDeAutosMadMax.escogerArmas(new ArmasSierra());
            break;
            case 5:
            builderDeAutosMadMax.escogerArmas(new ArmasMetralleta());
            break;
            default:
            break;
        }
        return builderDeAutosMadMax.getAutoMadMax();
    }

    /**
    * Imprime una indicacion y devuelve la entrada estandar hasta que esta es capaz de ser guardada en un entero, de lo contrario imprime un mensaje de error y la indicacion de nuevo hasta que es asi.
    * @param indicacion el mensaje correspondiente a la indicacion.
    * @param error el mensaje de error.
    * @param limiteInferior el numero minimo aceptable.
    * @param limiteSuperior el numero macimo aceptable.
    * @return el unico digito obtenido de la entrada estandar.
    */
    public int getint(String indicacion, String error, int limiteInferior, int limiteSuperior){
        int num=0;
        boolean c=true;
        Scanner scn=new Scanner(System.in);

        do{
            System.out.println(indicacion);
            if(scn.hasNextInt()){
                num=scn.nextInt();
                if(num>=limiteInferior && num<=limiteSuperior) c=false;
            }
            else{
                scn.next();
                System.out.println(error);
            }
        }while(c);
        return num;
    }

    /**
    * Imprime una indicacion y devuelve la entrada estandar hasta que esta es capaz de ser guardada en un entero, de lo contrario imprime un mensaje de error y la indicacion de nuevo hasta que es asi.
    * @param indicacion el mensaje correspondiente a la indicacion.
    * @param error el mensaje de error.
    * @return el unico entero obtenido de la entrada estandar.
    */
    public int getint(String indicacion, String error){
        int num=0;
        boolean c=true;
        Scanner scn=new Scanner(System.in);

        do{
            System.out.println(indicacion);
            if(scn.hasNextInt()){
                num=scn.nextInt();
                c=false;
            }
            else{
                scn.next();
                System.out.println(error);
            }
        }while(c);
        return num;
    }
}
