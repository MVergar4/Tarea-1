package org.example;
/**
 * Subclase que entrega el nombre del producto elegido por el comprador
 */
public class CocaCola extends Bebida {
    /** Constructor */
    public CocaCola() {
        super();
    }
    /** Metodo que entrega el nombre del producto consumido*/
    public String consumir() {
        return "cocacola";
    }
}