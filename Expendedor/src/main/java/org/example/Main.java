package org.example;
import java.util.ArrayList;

abstract class Moneda {
    public Moneda() {
    }
    public abstract int getValor();
    public Moneda getSerie() {
        return this;
    }
}

class Moneda1500 extends Moneda {
    public Moneda1500() {
        super();
    }
    public int getValor() {
        return 1500;
    }
}
class Moneda1000 extends Moneda {
    public Moneda1000() {
        super();
    }
    public int getValor() {
        return 1000;
    }
}
class Moneda500 extends Moneda {
    public Moneda500() {
        super();
    }
    public int getValor() {
        return 500;
    }
}
class Moneda100 extends Moneda {
    public Moneda100() {
        super();
    }
    public int getValor() {
        return 100;
    }
}

abstract class Bebida {
    private int serie;
    public Bebida(int x) {
        serie = x;
    }
    public int getSerie() {
        return serie;
    }
    public abstract String beber();
}
class CocaCola extends Bebida {
    public CocaCola(int x) {
        super(x);
    }
    public String beber() {
        return "cocacola";
    }
}
class Sprite extends Bebida {
    public Sprite(int x) {
        super(x);
    }
    public String beber() {
        return "sprite";
    }
}

class Comprador {
    private String sonido = null;
    private int vuelto = 0;
    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        Bebida b1 = exp.comprarBebida(m, cualBebida);
        if (b1 != null) {
            sonido = b1.beber();
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

class Deposito {
    private ArrayList<Bebida> al;
    public Deposito(int n) {
        al = new ArrayList(n);
    }
    public Bebida getBebida() {
        if (al.size() > 0) {
            return al.remove(0);
        } else {
            return null;
        }
    }
    public void addBebida(Bebida b) {
        al.add(b);
    }
}
class DepositoM {
    private ArrayList<Moneda> al;
    public DepositoM() {
        al = new ArrayList();
    }
    public void addMoneda(Moneda m) {
        Moneda m100 = null;
        for (int i = 0; i < (m.getValor() / 100); i++) {
            m100 = new Moneda100();
            al.add(m100);
        }
    }
    public Moneda getMoneda() {
        if (al.size() > 0) {
            return al.remove(0);
        } else {
            return null;
        }
    }
}

class Expendedor {
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
            Bebida b1 = new CocaCola(100 + i);
            coca.addBebida(b1);
            Bebida b2 = new Sprite(200 + i);
            sprite.addBebida(b2);
        }
        precio = precioBebidas;
    }
    public Bebida comprarBebida(Moneda m, int cual) {
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
    }
    public Moneda getVuelto() {
        return monVu.getMoneda();
    }
}

public class Main {
    public static void main(String[] args) {

    }
}