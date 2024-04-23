package org.example;
import java.util.ArrayList;

public class Deposito {
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