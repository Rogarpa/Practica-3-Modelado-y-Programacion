public class MotorDeportivo extends Motor{

    public int ataque=3;

    public int defensa=5;

    public int velocidad=30;

    public int precio=35;

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
