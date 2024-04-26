package org.example;

public abstract class Bebida extends Producto {
    public Bebida(int x) {
        super(x);
    }
    public abstract String consumir();
}