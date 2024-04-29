package org.example;
/**
 * Un enum donde se guardan los tipos de productos y sirve para retornar los precios de estos mismos.
 */
public enum Articulos{
    /** Precio CocaCola */
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
    public Moneda getDiferencia(){
        if(precio==900){
            return new Moneda900();
        }
        else if(precio ==800){
            return new Moneda800();
        }
        else if(precio ==600){
            return new Moneda600();
        }
        else if(precio ==400){
            return new Moneda400();
        }
        else if(precio == 300){
            return new Moneda300();
        }
        else{
            return null;
        }
    }
    public int getPrecio(){
        return precio;
    }
}
