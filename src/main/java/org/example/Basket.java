package org.example;

public class Basket {
    private static String items = "";

    public static void main(String[] args) {
        add("Колбаса", 76);
        add("Молоко", 55);
        add("Масло", 120);
        
    }

    public static void add(String name, int price) {
        items = "\n" + name + " - " + price;
    }

    public static void clear() {
        items = "";
    }

    public static void print(String title) {
        if (items.isEmpty()) {
            System.out.println("Basket is empty");
        } else {
            System.out.println(items);
        }
    }
}
