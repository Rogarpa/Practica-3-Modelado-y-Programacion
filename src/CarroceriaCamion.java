public class CarroceriaCamion extends Carroceria{

    int ataque=15;

    int defensa=60;

    int velocidad=25;

    int costo=200;

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
