package org.example;

public enum Articulos{
    COCA(1200),
    SPRITE(1000),
    FANTA(800), //Precio de cada articulo.
    SNICKER(300),
    SUPER8(400);
    private final int precio;
    Articulos(int x){
        this.precio=x;
    }
    public int getPrecio(){
        return precio;
    }
}
