package org.example;

public class Expendedor {
    private DepositoG<Bebida> coca;
    private DepositoG<Bebida> sprite;
    private DepositoG<Moneda> monVu = new DepositoG();
    private int precio;
    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new DepositoG();
        sprite = new DepositoG();
        for (int i = 0; i < numBebidas; i++) {
            Bebida b1 = new CocaCola();
            coca.addObject(b1);
            Bebida b2 = new Sprite();
            sprite.addObject(b2);
        }
        precio = precioBebidas;
    }
    public Bebida comprarBebida(Moneda m, int cual) {
        if (m == null) {
            return null;
        } else {
            Bebida b = null;
            if (cual == Articulos.COCA.ordinal()) {
                b = coca.getObject();
            } else if (cual == Articulos.SPRITE.ordinal()) {
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
                if (cual == Articulos.COCA.ordinal()) {
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
            } else if (cual == Articulos.COCA.ordinal() && b != null) {
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
            } else if (cual == Articulos.SPRITE.ordinal() && b != null) {
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