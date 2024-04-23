package org.example;
import java.util.ArrayList;

public class DepositoM {
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