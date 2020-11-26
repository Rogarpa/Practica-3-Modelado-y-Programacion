public interface Componente{

    /**
    *Metodo para obtener el atributo de ataque del Componente.
    *@return el ataque del Componente.
    */
    public int getAtaque();

    /**
    *Metodo para obtener el atributo de defensa del Componente.
    *@return la defensa del Componente.
    */
    public int getDefensa();

    /**
    *Metodo para obtener el atributo de velocidad del Componente a sumar al auto.
    *@return la velocidad que le agrega el Componente al auto.
    */
    public int getVelocidad();

    /**
    *Metodo para obtener el precio del Componente.
    *@return el precio del Componente.
    */
    public int getPrecio();

}
