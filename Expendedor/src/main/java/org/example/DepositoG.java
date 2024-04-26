package org.example;
import java.util.ArrayList;

class DepositoG<T>{
    private ArrayList<T> al;
    public DepositoG(){
        this.al = new ArrayList();
    }
    public Object getObject(){
        if (al.size() > 0) {
            return al.remove(0);
        } else {
            return null;
        }
    }
    public Object addObject(Object obj){
        al.add(obj);
    }
}
