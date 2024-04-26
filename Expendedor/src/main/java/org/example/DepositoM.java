package org.example;
import java.util.ArrayList;

public class DepositoM {
    private ArrayList<Moneda> al;
    public DepositoM() {
        al = new ArrayList();
    }
    public void addMoneda(Moneda m) {
        al.add(m);
    }
    public Moneda getMoneda() {
        if (al.size() > 0) {
            return al.remove(0);
        } else {
            return null;
        }
    }
}