package org.example;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(3);
        Moneda m = new Moneda1000();
        Moneda m5 = new Moneda500();
        Moneda m1 = new Moneda100();
        Comprador p = null;
        p = new Comprador(null, Articulos.COCA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        System.out.println();

        p = new Comprador(m, Articulos.COCA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m1, Articulos.COCA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.COCA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.COCA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.COCA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        System.out.println();

        p = new Comprador(m, Articulos.SPRITE.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m1, Articulos.SPRITE.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.SPRITE.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.SPRITE.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.SPRITE.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        System.out.println();

        p = new Comprador(m, Articulos.FANTA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m1, Articulos.FANTA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.FANTA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.FANTA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.FANTA.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        System.out.println();

        p = new Comprador(m, Articulos.SNICKERS.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m1, Articulos.SNICKERS.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.SNICKERS.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.SNICKERS.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.SNICKERS.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        System.out.println();

        p = new Comprador(m, Articulos.SUPER8.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m1, Articulos.SUPER8.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.SUPER8.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.SUPER8.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        p = new Comprador(m, Articulos.SUPER8.ordinal(), exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queConsumiste());
        System.out.println();
    }
}