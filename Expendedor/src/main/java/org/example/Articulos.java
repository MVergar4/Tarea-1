package org.example;
/**
 * Un enum donde se guardan los tipos de productos y sirve para retornar los precios de estos mismos.
 */
public enum Articulos{
    /** Precio Cocacola */
    COCA(900),
    /** Precio Sprite */
    SPRITE(800),
    /** Precio Fanta */
    FANTA(600),
    /** Precio Snicker */
    SNICKERS(400),
    /** Precio Super8 */
    SUPER8(300);
    /** Entero para almacenar el precio del producto pedido */
    private final int precio;

    /**
     * Metodo que guarda el precio del producto solicitado
     * @param x guarda el precio del producto solicitado
     */
    Articulos(int x){
        this.precio=x;
    }

    /**
     * Getter del precio del producto pedido.
     * @return Devuelve el precio del producto pedido mediante una moneda
     */
    public Moneda getPrecio(){
        switch(precio){
            case(300):
                Moneda m = new Moneda300();
            case(400):
                Moneda m = new Moneda400();
            case(600):
                Moneda m = new Moneda600();
            case(800):
                Moneda m = new Moneda800();
            case(900):
                Moneda m = new Moneda900();
        }
        return m;
    }
}
