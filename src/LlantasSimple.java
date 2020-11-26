public class LlantasSimple extends Llantas{

    int ataque=7;

    int defensa=7;

    int velocidad=8;

    int costo=23;

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
