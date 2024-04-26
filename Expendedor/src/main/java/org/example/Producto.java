package org.example;

public abstract class Producto {
    private int serie;
    public Producto(int x) {
        serie = x;
    }
    public int getSerie() {
        return serie;
    }
    public abstract String consumir();
}
