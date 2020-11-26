public class MotorTurbo extends Motor{

    int ataque=10;

    int defensa=5;

    int velocidad=35;

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
