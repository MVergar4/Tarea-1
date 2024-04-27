package org.example;

public abstract class Producto {
    public Producto() {
    }
    public Producto getSerie() {
        return this;
    }
    public abstract String consumir();
}
