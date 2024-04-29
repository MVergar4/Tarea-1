package org.example;

/**
 * Superclase Moneda que
 */
public abstract class Moneda {
    /** Constructor */
    public Moneda() {}
    /** Metodo abstracto que devuelve el valor de la moneda*/
    public abstract int getValor();

    /**
     * Metodo que devuelve la dirección del objeto creado en este caso la moneda a modo de numero de serie
     * @return direccion/Numero de serie.
     */
    public Moneda getSerie() {
        return this;
    }
}
