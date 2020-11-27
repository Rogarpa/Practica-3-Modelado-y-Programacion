public class AutoMadMax{

    protected Llantas llantas;
    protected Motor motor;
    protected Carroceria carroceria;
    protected Blindaje blindaje;
    protected Armas armas;

    protected int velocidad;
    protected int ataque;
    protected int defensa;
    protected int costo;

    /**
    *Metodo para definir las llantas del coche.
    *@param llantas las llantas del coche.
    */
    public void setLlantas(Llantas llantas){
        this.llantas=llantas;
    }

    /**
    *Metodo para definir el Motor del coche.
    *@param motor el motor a poner.
    */
    public void setMotor(Motor motor){
        this.motor=motor;
    }

    /**
    *Metodo para definir la carroceria del coche.
    *@param carroceria la carroceria a poner.
    */
    public void setCarroceria(Carroceria carroceria){
        this.carroceria=carroceria;
    }

    /**
    *Metodo para definir el Blindaje del coche.
    *@param blindaje el blindaje a poner.
    */
    public void setBlindaje(Blindaje blindaje){
        this.blindaje=blindaje;
    }

    /**
    *Metodo para definir las Armas del coche.
    *@param armas las armas a definir.
    */
    public void setArmas(Armas armas){
        this.armas=armas;
    }

    /**
    *Metodo para obtener el costo total del coche.
    *@return el costo total.
    */
    public int getCosto(){
        this.costo=this.blindaje.getCosto()+this.motor.getCosto()+this.carroceria.getCosto()+this.llantas.getCosto()+this.armas.getCosto();
        return this.costo;
    }

    /**
    *Metodo para obtener la velocidad total del coche.
    *@return la velocidad total.
    */
    public int getVelocidad(){
        this.velocidad=this.blindaje.getVelocidad()+this.motor.getVelocidad()+this.carroceria.getVelocidad()+this.llantas.getVelocidad()+this.armas.getVelocidad();
        return this.velocidad;
    }

    /**
    *Metodo para obtener el ataque total del coche.
    *@return el ataque total.
    */
    public int getAtaque(){
        this.ataque=this.blindaje.getAtaque()+this.motor.getAtaque()+this.carroceria.getAtaque()+this.llantas.getAtaque()+this.armas.getAtaque();
        return this.ataque;
    }

    /**
    *Metodo para obtener la defensa total del coche.
    *@return la defensa total.
    */
    public int getDefensa(){
        this.defensa=this.blindaje.getDefensa()+this.motor.getDefensa()+this.carroceria.getDefensa()+this.llantas.getDefensa()+this.armas.getDefensa();
        return this.defensa;
    }

    /**
    *Metodo para obtener una descripción de las propiedades del coche.
    */
    public String getDescripcion(){
        return "Coche con \n"+"Velocidad:"+getVelocidad()+"\nAtaque:"+getAtaque()+"\nDefensa:"+getDefensa()+"\nCon un costo de:$"+getCosto();
    }
}
