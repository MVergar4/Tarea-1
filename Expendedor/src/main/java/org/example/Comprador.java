package org.example;

public class Comprador {
    private String sonido = null;
    private int vuelto = 0;
    public Comprador(Moneda m, int cualBebida, Expendedor exp) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        Bebida b1 = exp.comprarBebida(m, cualBebida);
        if (b1 != null) {
            sonido = b1.consumir();
            Moneda m1 = null;
            while (true) {
                m1 = exp.getVuelto();
                if (m1 != null) {
                    vuelto = vuelto + m1.getValor();
                } else {
                    break;
                }
            }
        } else {
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
    }
    public int cuantoVuelto() {
        return vuelto;
    }
    public String queBebiste() {
        return sonido;
    }
}