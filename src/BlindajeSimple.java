public class BlindajeSimple extends Blindaje{

    int ataque=0;

    int defensa=20;

    int velocidad=0;

    int costo=50;

    @Override
    public int getAtaque(){
        return this.ataque;
    }

    @Override
    public int getDefensa(){
        return this.defensa;
    }

    @Override
    public int getVelocidad(){
        return this.velocidad;
    }

    @Override
    public int getPrecio(){
        return this.costo;
    }

}
