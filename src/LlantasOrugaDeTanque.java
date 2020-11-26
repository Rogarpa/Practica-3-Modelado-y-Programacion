public class LlantasOrugaDeTanque extends Llantas{

    int ataque=6;

    int defensa=12;

    int velocidad=6;

    int costo=32;

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
