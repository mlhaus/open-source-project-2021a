package com.hauschildt;



public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
	
=======
        Order order = new Order();
        order.addItem(PizzaItem.PEPPERONI.getItem());
        order.addItem(PizzaItem.SAUSAGE.getItem());
        order.addItem(PizzaItem.CHEESE.getItem());
        order.addItem(PizzaItem.THE_WORKS.getItem());
        System.out.println(order.getNumberOfItems());
        System.out.println(order.getItem(0).getName());
        System.out.println(order.getItem(1).getName());
        System.out.println(order.getItem(2).getName());
        System.out.println(order.getItem(3).getName());
        // Hello
>>>>>>> 2a500abb55ca6f096111cc99de0cc6d4d9ae90d9
    }
}
