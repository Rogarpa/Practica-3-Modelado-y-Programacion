public interface BuilderAutos{

    /**
    *Metodo que ayuda a seleccionar las llantas del coche a crear.
    *@param llantas las llantas que usará.
    */
    public void escogerLlantas(Llantas llantas);

    /**
    *Metodo que ayuda a seleccionar el motor del coche a crear.
    *@param motor el motor que usará.
    */
    public void escogerMotor(Motor motor);

    /**
    *Metodo que ayuda a seleccionar la carroceria del coche a crear.
    *@param carroceria la carroceria del coche.
    */
    public void escogerCarroceria(Carroceria carroceria);

    /**
    *Metodo que ayuda a seleccionar el Blindaje del coche a crear.
    *@param blindaje el blindaje del coche.
    */
    public void escogerBlindaje(Blindaje blindaje);

    /**
    *Metodo que ayuda a seleccionar las armas del coche a crear.
    *@param armas las armas del coche.
    */
    public void escogerArmas(Armas armas);
}
