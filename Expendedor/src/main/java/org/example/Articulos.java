package org.example;
/**
 * Un enum donde se guardan los tipos de productos y sirve para retornar los precios de estos mismos.
 */
public enum Articulos{
    /** Productos del expendedor con sus respectivos.*/
    COCA(900),
    SPRITE(800),
    FANTA(600),
    SNICKERS(400),
    SUPER8(300);
    private final int precio; /** Entero para almacenar el precio del producto pedido */
    Articulos(int x){ /** Metodo que guarda el precio del producto solicitado*/
        this.precio=x;
    }
    public int getPrecio(){
        return precio; /** Getter del precio del producto solicitado */
    }
}
