package org.example;

public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu = new DepositoM();
    private int precio;
    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito(numBebidas);
        sprite = new Deposito(numBebidas);
        for (int i = 0; i < numBebidas; i++) {
            Bebida b1 = new CocaCola();
            coca.addBebida(b1);
            Bebida b2 = new Sprite();
            sprite.addBebida(b2);
        }
        precio = precioBebidas;
    }
    public Bebida comprarBebida(Moneda m, int cual) {
        try {
            if (m == null) {
                return null;
            } else {
                Bebida b = null;
                if (cual == COCA) {
                    b = coca.getBebida();
                } else if (cual == SPRITE) {
                    b = sprite.getBebida();
                } else {
                    monVu.addMoneda(m);
                    return null;
                }
                if (m.getValor() < precio) {
                    if (cual == COCA) {
                        coca.addBebida(b);
                    } else {
                        sprite.addBebida(b);
                    }
                    monVu.addMoneda(m);
                    return null;
                } else if (cual == COCA && b != null) {
                    if (m.getValor() > precio) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - precio) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addMoneda(m100);
                        }
                        return b;
                    } else {
                        return b;
                    }
                } else if (cual == SPRITE && b != null) {
                    if (m.getValor() > precio) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - precio) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addMoneda(m100);
                        }
                        return b;
                    } else {
                        return b;
                    }
                } else {
                    monVu.addMoneda(m);
                    return null;
                }
            }
        } catch (Exception e) {
            return null;
        }

    }
    public Moneda getVuelto() {
        return monVu.getMoneda();
    }
}
