package com.company.data;

import java.util.Hashtable;
import java.util.Map;


public class MetroCartBlank implements java.io.Serializable{
    private Map<String ,MetroCart> store;

    public MetroCartBlank(){
        store = new Hashtable<>();
    }

    public int numCart(){
        return store.size();
    }

    public boolean add(MetroCart metroCart){
        return null == store.put(metroCart.getSerNum(), metroCart);
    }

    public boolean remove(String serNum){
        MetroCart tmp = store.remove(serNum);
        return tmp != null;
    }

    public boolean addMoney(String serName,double money){
        MetroCart cart = store.get(serName);
        cart.setBalance(cart.getBalance() + money);
        return true;
    }

    public boolean pay(String  serName, double money){
        return store.get(serName).pay(money);
    }

    public Map<String,MetroCart> getStore() {
        return store;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("List metro card");
        store.values().forEach(e -> {
            sb.append("\n\n").append(e);
        });
        return sb.toString();
    }
}
