public class BlindajeReforzado extends Blindaje{

    /**
    *Constructor de la clase.
    */
    public BlindajeReforzado(){
        ataque = 2;
        defensa = 2;
        velocidad =2;
        costo = 2;
    }

    @Override
    public int getAtaque(){return ataque;}
    @Override
    public int getDefensa(){return defensa;}
    @Override
    public int getVelocidad(){return velocidad;}
    @Override
    public int getCosto(){return costo;}
}
