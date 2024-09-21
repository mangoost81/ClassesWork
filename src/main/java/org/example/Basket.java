package org.example;

public class Basket {
    private String items = "";
    private int totalprice = 0;
    private int limit;
    private double totalWeight = 0;

    public Basket() {
        items = "Список товаров: ";
        this.limit = 100000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalprice) {
        this();
        this.items = this.items + items;
        this.totalprice = totalprice;
    }



    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {

        if (contains(name)) {
            return;
        }
        if (totalprice + count * price >= limit) {
            return;
        }
        items = items + "\n" + name + " - " + count + " шт- " + price;
        totalprice = totalprice + count * price;
    }

    public void add(String name, int price, int count, double weight) {
        add(name, price, count);
        totalWeight = totalWeight + weight;
    }

    public void clear() {
        items = "";
        totalprice = 0;
        totalWeight = 0;
    }

    public void print(String title) {
        if (items.isEmpty()) {
            System.out.println("Basket is empty");
        } else {
            System.out.println(title + "\n" + items + "\n");
        }
    }

    public int getTotalprice() {
        return totalprice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public double getTotalWeight(){
        return totalWeight;
    }


}
