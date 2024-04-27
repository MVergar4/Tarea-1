package org.example;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(3,400);
        Moneda m = new Moneda500();
        Comprador p = null;
        p = new Comprador(null, Articulos.COCA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queBebiste());
        p = new Comprador(m, Articulos.SPRITE.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queBebiste());
        p = new Comprador(m, Articulos.COCA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queBebiste());
        p = new Comprador(m, Articulos.COCA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queBebiste());
        p = new Comprador(m, Articulos.COCA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queBebiste());
        p = new Comprador(m, Articulos.COCA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queBebiste());
    }
}