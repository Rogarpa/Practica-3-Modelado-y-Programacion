public class LlantasOffRoad extends Llantas{

    public int ataque=9;

    public int defensa=10;

    public int velocidad=7;

    public int costo=29;

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
