package org.example;

/**
 * Superclase Moneda que
 */
public abstract class Moneda implements Comparable<Moneda> {
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

    /**
     * Metodo que sirve para medir si se puede comprar un producto o no,
     * @param v El precio del producto.
     * @return la diferencia entre la moneda ingresada y el precio del producto
     */
    public int compareTo(Moneda v){
        return this.getValor()-v.getValor();
    }
}
