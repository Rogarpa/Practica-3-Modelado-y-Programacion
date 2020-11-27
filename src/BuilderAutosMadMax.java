public class BuilderAutosMadMax implements BuilderAutos{
    protected AutoMadMax autoADiseñar;

    /**
    *Constructor de la Clase.
    */
    public BuilderAutosMadMax(){
        autoADiseñar = new AutoMadMax();
    }

    /**
    *Metodo para Obtener el auto ya diseñado.
    *@return el auto ya diseñado.
    */
    public AutoMadMax getAutoMadMax(){
        return autoADiseñar;
    }

    @Override
    public void escogerLlantas(Llantas llantas){
        autoADiseñar.setLlantas(llantas);
    }

    @Override
    public void escogerMotor(Motor motor){
        autoADiseñar.setMotor(motor);
    }

    @Override
    public void escogerBlindaje(Blindaje blindaje){
        autoADiseñar.setBlindaje(blindaje);
    }

    @Override
    public void escogerCarroceria(Carroceria carroceria){
        autoADiseñar.setCarroceria(carroceria);
    }

    @Override
    public void escogerArmas(Armas armas){
        autoADiseñar.setArmas(armas);
    }

}
