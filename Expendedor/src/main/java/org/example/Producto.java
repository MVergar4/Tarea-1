package org.example;

/**
 * Superclase para todos los tipos de productos
 */
public abstract class Producto {
    /** Constructor */
    public Producto() {}
    /** Metodo que devuelve la direccion del objeto creado que corresponde a el numero de serie del producto.*/
    public Producto getSerie() {
        return this;
    }
    /** Metodo abstracto que despues sirve para devolver que producto se ha consumido/devuelto */
    public abstract String consumir();
}
