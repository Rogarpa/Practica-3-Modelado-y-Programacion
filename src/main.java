import java.util.*;

public class main{

    public static void main(String[] args){


    }

    //FALTA DOCUMENTAR
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
        } while (indice != 0);
    }

    public void desplegarMenuPresupuesto(){
        int indice=0;
        int dinero = 0;
        AutoMadMax presupuestado;
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



    }

    public AutoMadMax desplegarMenuDiseñoFijo(){
        BuilderAutos builderDeAutosMadMax = new BuilderAutosMadMax();

        Director constructorDiseñosPredeterminados = new Director(b);

        int indice=0;
        int dinero = 0;
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////Bienvenido al presupuestador/////////////////////////////////////////////////");

            System.out.println("0.-The Ripper");
            System.out.println("1.-The Furnace");
            System.out.println("2.-The DieRolla");
            System.out.println("3.-The DeathRattle");
            indice = getint("Digite el numero de la opcion y presione enter:","No es un numero valido.", 0, 3);
            switch(indice){
                case 0:
                    constructorDiseñosPredeterminados.theRipper();
                    return builderDeAutosMadMax.getAutoMadMax();
                case 1:
                    constructorDiseñosPredeterminados.theFurnace();
                    return builderDeAutosMadMax.getAutoMadMax();
                    break;
                case 2:
                    constructorDiseñosPredeterminados.theDieRolla();
                    return builderDeAutosMadMax.getAutoMadMax();
                    break;
                case 3:
                    constructorDiseñosPredeterminados.theDeathRattle();
                    return builderDeAutosMadMax.getAutoMadMax();
                    break;
                default:
                    break;
                }

    }

    public AutoMadMax desplegarMenuDiseñoPersonalizado(){
        int indice=0;
        int dinero = 0;
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////Bienvenido al presupuestador/////////////////////////////////////////////////");


            System.out.println("0.-Escoger diseños fijos");
            System.out.println("1.-Escoger diseño personalizado");
            indice = getint("Digite el numero de la opcion y presione enter:","No es un numero valido.", 0, 1);
            switch(indice){
                case 0:
                    break;
                case 1:
                    desplegarMenuDiseñoPersonalizado();
                default:
                    break;
            }


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
                if(num>=limiteInferior||num<=limiteSuperior) c=false;
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
