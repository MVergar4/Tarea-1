package org.example;

public class Comprador {
    private String sonido = null;
    private int vuelto = 0;
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException  {
        Producto p = exp.comprarProducto(m, cualProducto);
        sonido = p.consumir();
        Moneda m1 = null;
        while (true) {
            m1 = exp.getVuelto();
            if (m1 != null) {
                vuelto = vuelto + m1.getValor();
            } else {
                break;
            }
        }
    }
    public int cuantoVuelto() {
        return vuelto;
    }
    public String queConsumiste() {
        return sonido;
    }
}