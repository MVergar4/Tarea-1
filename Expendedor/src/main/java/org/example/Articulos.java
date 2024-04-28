package org.example;

public enum Articulos{
    COCA(900),
    SPRITE(800),
    FANTA(600), //Precio de cada articulo.
    SNICKERS(400),
    SUPER8(300);
    private final int precio;
    Articulos(int x){
        this.precio=x;
    }
    public int getPrecio(){
        return precio;
    }
}
