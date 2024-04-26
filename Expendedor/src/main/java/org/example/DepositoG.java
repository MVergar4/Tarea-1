package org.example;
import java.util.ArrayList;

class DepositoG<T>{
    private ArrayList<T> al;
    public DepositoG(){
        this.al = new ArrayList<>();
    }
    public T getObject(){
        if (!al.isEmpty()) {
            return al.remove(0);
        } else {
            return null;
        }
    }
    public void addObject(T obj){
        al.add(obj);
    }
}
