public class CarroceriaCasual extends Carroceria{

    int ataque=10;

    int defensa=40;

    int velocidad=30;

    int costo=100;

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
