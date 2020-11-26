public class BlindajeReforzado extends Blindaje{

    int ataque=0;

    int defensa=30;

    int velocidad=0;

    int costo=60;

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
