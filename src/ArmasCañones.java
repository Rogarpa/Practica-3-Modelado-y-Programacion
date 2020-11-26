public class ArmasCañones extends Armas{

    int ataque=32;

    int defensa=0;

    int velocidad=0;

    int costo=40;

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
