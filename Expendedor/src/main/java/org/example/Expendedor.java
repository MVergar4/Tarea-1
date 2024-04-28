package org.example;

public class Expendedor {
    private DepositoG<Producto> coca = new DepositoG();
    private DepositoG<Producto> sprite = new DepositoG();
    private DepositoG<Producto> fanta = new DepositoG();
    private DepositoG<Producto> snickers = new DepositoG();
    private DepositoG<Producto> super8 = new DepositoG();
    private DepositoG<Moneda> monVu = new DepositoG();
    public Expendedor(int numProductos) {
        for (int i = 0; i < numProductos; i++) {
            Producto p = null;
            p = new CocaCola();
            coca.addObject(p);
            p = new Sprite();
            sprite.addObject(p);
            p = new Fanta();
            fanta.addObject(p);
            p = new Snickers();
            snickers.addObject(p);
            p = new Super8();
            super8.addObject(p);
        }
    }
    public Producto comprarProducto(Moneda m, int cual) {
        if (m == null) {
            return null;
        } else {
            if (cual == Articulos.COCA.ordinal()) {
                if (coca.checkObject()) {
                    if (m.getValor() < Articulos.COCA.getPrecio()) {
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            Moneda m100 = null;
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return null;
                    } else if (m.getValor() > Articulos.COCA.getPrecio()) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.COCA.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return coca.getObject();
                    } else {
                        return coca.getObject();
                    }
                } else {
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        Moneda m100 = null;
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    };
                    return null;
                }
            } else if (cual == Articulos.SPRITE.ordinal()) {
                if (sprite.checkObject()) {
                    if (m.getValor() < Articulos.SPRITE.getPrecio()) {
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            Moneda m100 = null;
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return null;
                    } else if (m.getValor() > Articulos.SPRITE.getPrecio()) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.SPRITE.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return sprite.getObject();
                    } else {
                        return sprite.getObject();
                    }
                } else {
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        Moneda m100 = null;
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    };
                    return null;
                }
            } else if (cual == Articulos.FANTA.ordinal()) {
                if (fanta.checkObject()) {
                    if (m.getValor() < Articulos.FANTA.getPrecio()) {
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            Moneda m100 = null;
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return null;
                    } else if (m.getValor() > Articulos.FANTA.getPrecio()) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.FANTA.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return fanta.getObject();
                    } else {
                        return fanta.getObject();
                    }
                } else {
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        Moneda m100 = null;
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    };
                    return null;
                }
            } else if (cual == Articulos.SNICKERS.ordinal()) {
                if (snickers.checkObject()) {
                    if (m.getValor() < Articulos.SNICKERS.getPrecio()) {
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            Moneda m100 = null;
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return null;
                    } else if (m.getValor() > Articulos.SNICKERS.getPrecio()) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.SNICKERS.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return snickers.getObject();
                    } else {
                        return snickers.getObject();
                    }
                } else {
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        Moneda m100 = null;
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    };
                    return null;
                }
            } else if (cual == Articulos.SUPER8.ordinal()) {
                if  (super8.checkObject()) {
                    if (m.getValor() < Articulos.SUPER8.getPrecio()) {
                        for (int i = 0; i < (m.getValor() / 100); i++) {
                            Moneda m100 = null;
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return null;
                    } else if (m.getValor() > Articulos.SUPER8.getPrecio()) {
                        Moneda m100 = null;
                        for (int i = 0; i < ((m.getValor() - Articulos.SUPER8.getPrecio()) / 100); i++) {
                            m100 = new Moneda100();
                            monVu.addObject(m100);
                        }
                        return super8.getObject();
                    } else {
                        return super8.getObject();
                    }
                } else {
                    for (int i = 0; i < (m.getValor() / 100); i++) {
                        Moneda m100 = null;
                        m100 = new Moneda100();
                        monVu.addObject(m100);
                    };
                    return null;
                }
            } else {
                for (int i = 0; i < (m.getValor() / 100); i++) {
                    Moneda m100 = null;
                    m100 = new Moneda100();
                    monVu.addObject(m100);
                }
                return null;
            }
        }
    }
    public Moneda getVuelto() {
        return monVu.getObject();
    }
}