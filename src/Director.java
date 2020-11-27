public class Director{

    protected BuilderAutos builder;

    /**
    *El constructor de la Clase.
    *@param builder el builder a usar.
    */
    public Director(BuilderAutos builder){
        this.builder=builder;
    }

    /**
    *Metodo para cambiar el builder actual.
    *@param builder el builder a cambiar.
    */
    public void cambiarBuilder(BuilderAutos builder){
        this.builder=builder;
    }

    /**
    *Coche ya predefinido.
    */
    public void theRipper(){
        builder.escogerLlantas(new LlantasSimple());
        builder.escogerMotor(new MotorDeportivo());
        builder.escogerCarroceria(new CarroceriaCasual());
        builder.escogerBlindaje(new BlindajeSimple());
        builder.escogerArmas(new ArmasSierra());
    }

    /**
    *Coche ya predefinido.
    */
    public void theFurnace(){
        builder.escogerLlantas(new LlantasOffRoad());
        builder.escogerMotor(new MotorDiesel());
        builder.escogerCarroceria(new CarroceriaDeportiva());
        builder.escogerBlindaje(new BlindajeSimple());
        builder.escogerArmas(new ArmasLanzallamans());
    }

    /**
    *Coche ya predefinido.
    */
    public void theDieRolla(){
        builder.escogerLlantas(new LlantasDeportiva());
        builder.escogerMotor(new MotorTurbo());
        builder.escogerCarroceria(new CarroceriaDeportiva());
        builder.escogerBlindaje(new BlindajeSimple());
        builder.escogerArmas(new ArmasMetralleta());
    }

    /**
    *Coche ya predefinido.
    */
    public void theDeathRattle(){
        builder.escogerLlantas(new LlantasOrugaDeTanque());
        builder.escogerMotor(new MotorDiesel());
        builder.escogerCarroceria(new CarroceriaCamion());
        builder.escogerBlindaje(new BlindajeTanque());
        builder.escogerArmas(new ArmasCanones());
    }
}
