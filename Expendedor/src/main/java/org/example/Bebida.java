package org.example;
/**
 * Superclase y Subclase de producto y los productos que son bebidas respectivamente.
 */
public abstract class Bebida extends Producto {
    /** Constructor que por defecto solo inicializa*/
    public Bebida() {
        super();
    }
    /** Metodo abstracto que se implementa en las subclases */
    public abstract String consumir();
}