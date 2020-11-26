public class LlantasDeportiva extends Llantas{

    int ataque=8;

    int defensa=6;

    int velocidad=10;

    int costo=25;

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
