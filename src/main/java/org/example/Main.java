package org.example;

public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Milk", 80);
        vasyaBasket.add("Broad", 40);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Lopata", 280);
        petyaBasket.add("Bochka", 2900);

        Basket mashaBasket = new Basket("Table", 5000);

        vasyaBasket.print("Vasya Basket: ");
        petyaBasket.print("Petya Basket: ");
        mashaBasket.print("Masha Basket: ");
        mashaBasket.add("Beer",200,3,2.5);
        mashaBasket.add("Cheetos",150,2,0.5);
        mashaBasket.add("Glass",40);

        mashaBasket.print("Masha Basket: ");

        System.out.println(mashaBasket.getTotalWeight());
        System.out.println(mashaBasket.getTotalprice());




//        Arithmetic nums = new Arithmetic(3,5);
//        System.out.println(nums.maximum());
//        System.out.println(nums.multiplication());
    }
}
