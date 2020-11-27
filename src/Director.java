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
        /**
        builder.Llantas(Llantas.LlantasSimple);
        builder.Motor(Motor.Deportivo);
        builder.Carroceria(Carroceria.CarroceriaCasual);
        builder.Blindaje(Blindaje.BlindajeSimple);
        builder.Armas(Armas.ArmasSierra);
    */}

    /**
    *Coche ya predefinido.
    */
    public void theFurnace(){
        /**
        builder.Llantas(Llantas.LlantasOffRoad);
        builder.Motor(Motor.MotorDiesel);
        builder.Carroceria(Carroceria.CarroceriaDeportiva);
        bilder.Blindaje(Blindaje.BlindajeSimple);
        builder.Armas(Armas.ArmasLanzallamas);
    */}

    /**
    *Coche ya predefinido.
    */
    public void theDieRolla(){
    /**    builder.Llantas(Llantas.LlantasDeportiva);
        builder.Motor(Motor.MotorTurbo);
        builder.Carroceria(Carroceria.CarroceriaDeportiva);
        builder.Blindaje(Blindaje.BlindajeSimple);
        builder.Armas(Armas.ArmasMetralleta);
    */}

    /**
    *Coche ya predefinido.
    */
    public void theDeathRattle(){
        /**
        builder.Llatas(Llantas.LlantasOrugaDeTanque);
        builder.Motor(Motor.MotorDiesel);
        builder.Carroceria(Carroceria.CarroceriaCamion);
        builder.Blindaje(Blindaje.BlindajeTanque);
        builder.Armas(Armas.ArmasCañones);
    */}
}
