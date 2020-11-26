public class CarroceriaDeportiva extends Carroceria{

    int  ataque=12;

    int defensa=30;

    int velocidad=40;

    int costo=150;

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
