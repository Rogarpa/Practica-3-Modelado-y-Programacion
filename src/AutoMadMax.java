public class AutoMadMax{

    protected Llantas llantas;
    protected Motor motor;
    protected Carroceria carroceria;
    protected Blindaje blindaje;
    protected Armas armas;

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
}
