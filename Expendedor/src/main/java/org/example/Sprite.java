package org.example;

/**
 * Subclase que entrega el nombre del producto elegido por el comprador
 */
public class Sprite extends Bebida {
    /** Constructor */
    public Sprite() {
        super();
    }
    /** Metodo que entrega el nombre del producto consumido*/
    public String consumir() {
        return "sprite";
    }
}