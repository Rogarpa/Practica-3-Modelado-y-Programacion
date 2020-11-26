public class MotorDiesel extends Motor{
    int ataque=7;

    int defensa=5;

    int velocidad=25;

    int costo=34;

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
