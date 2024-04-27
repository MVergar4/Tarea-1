package org.example;

public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    private DepositoG<Bebida> coca;
    private DepositoG<Bebida> sprite;
    private DepositoG<Moneda> monVu = new DepositoG();
    private int precio;
    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new DepositoG();
        sprite = new DepositoG();
        for (int i = 0; i < numBebidas; i++) {
            Bebida b1 = new CocaCola(100 + i);
            coca.addObject(b1);
            Bebida b2 = new Sprite(200 + i);
            sprite.addObject(b2);
        }
        precio = precioBebidas;
    }
    public Bebida comprarBebida (Moneda m, int cual) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        if (m == null) {
            throw new PagoIncorrectoException("Pago incorrecto, no se ha entregado moneda al expendedor");
        } else {
            Bebida b = null;
            if (cual == COCA) {
                b = coca.getObject();
            } else if (cual == SPRITE) {
                b = sprite.getObject();
            } else {
                for (int i = 0; i < (m.getValor() / 100); i++) {
                    Moneda m100 = null;
                    m100 = new Moneda100();
                    monVu.addObject(m100);
                }
                return null;
            }
            if (m.getValor() < precio) {
                if (cual == COCA) {
                    coca.addObject(b);
                } else {
                    sprite.addObject(b);
                }
                for (int i = 0; i < (m.getValor() / 100); i++) {
                    Moneda m100 = null;
                    m100 = new Moneda100();
                    monVu.addObject(m100);
                }
                return null;
            } else if (cual == COCA && b != null) {
                if (m.getValor() > precio) {
                    Moneda m100 = null;
                    for (int i = 0; i < ((m.getValor() - precio) / 100); i++) {
                        m100 = new Moneda100();
                        monVu.addObject(m100);
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
                        monVu.addObject(m100);
                    }
                    return b;
                } else {
                    return b;
                }
            } else {
                for (int i = 0; i < (m.getValor() / 100); i++) {
                    Moneda m100 = null;
                    m100 = new Moneda100();
                    monVu.addObject(m100);
                };
                return null;
            }
        }
    }
    public Moneda getVuelto() {
        return monVu.getObject();
    }
}
