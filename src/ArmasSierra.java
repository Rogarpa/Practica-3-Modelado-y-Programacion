public class ArmasSierra extends Armas{

int ataque=26;

int defensa=0;

int velocidad=0;

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
