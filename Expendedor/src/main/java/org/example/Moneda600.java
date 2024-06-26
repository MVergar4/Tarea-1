package org.example;
/**
 * Subclase Moneda600 que sirve meramente para devolver su valor.
 */
public class Moneda600 extends Moneda {
    /** Constructor que por defecto solo inicializa*/
    public Moneda600() {
        super();
    }

    /**
     * Metodo que devuelve el valor de la moneda
     * @return devuelve 600
     */
    public int getValor() {
        return 600;
    }
}
