package org.example;

public class Expendedor {
    private DepositoG<Moneda> monVu = new DepositoG();
    public Expendedor(int numBebidas, int precioBebidas) {

    }
    public Bebida comprarBebida (Moneda m, int cual) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {

    }
    public Moneda getVuelto() {
        return monVu.getObject();
    }
}
