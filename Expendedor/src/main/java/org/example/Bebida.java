package org.example;

public abstract class Bebida {
    private int serie;
    public Bebida(int x) {
        serie = x;
    }
    public int getSerie() {
        return serie;
    }
    public abstract String beber();
}