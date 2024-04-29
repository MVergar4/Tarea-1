package org.example;
/**
 * Un enum donde se guardan los tipos de productos y sirve para retornar los precios de estos mismos.
 */
public enum Articulos{
    /** Productos del expendedor con sus respectivos precios.*/
    COCA(900),
    SPRITE(800),
    FANTA(600),
    SNICKERS(400),
    SUPER8(300);
    /** Entero para almacenar el precio del producto pedido */
    private final int precio;

    /**
     * Metodo que guarda el precio del producto solicitado
     * @param Guarda el precio del producto solicitado
     */
    Articulos(int x){
        this.precio=x;
    }

    /**
     * Getter del precio del producto pedido.
     * @return Devuelve el precio del producto pedido
     */
    public int getPrecio(){
        return precio;
    }
}
