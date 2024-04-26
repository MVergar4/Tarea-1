package org.example;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(3,400);
        Moneda m = new Moneda500();
        Comprador p = null;
        p = new Comprador(null, Expendedor.COCA, exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queBebiste());
        p = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queBebiste());
        p = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queBebiste());
        p = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queBebiste());
        p = new Comprador(m, Expendedor.COCA, exp);
        System.out.println(p.cuantoVuelto() + ", " + p.queBebiste());
    }
}