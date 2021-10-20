package com.hauschildt;

public enum PizzaItem {
    PEPPERONI("Pepperoni Pizza", 13.49, "Your choice of crust covered " +
            "with our signature pizza sauce, real mozzarella cheese, and pepperoni. It's one " +
            "of our most popular pizzas.", Size.LARGE, Crust.ORIGINAL, Sauce.MARINARA,
            new Meat[]{Meat.PEPPERONI}, new Veggie[]{})
    ,SAUSAGE("Sausage Pizza", 13.49, "Our signature pizza sauce layered " +
            "with sausage and real mozzarella cheese. Your choice of crust.", Size.LARGE,
            Crust.ORIGINAL, Sauce.MARINARA, new Meat[]{Meat.SAUSAGE}, new Veggie[]{})
    ,CHEESE("Cheese Pizza", 12.99, "Simple, yet delicious. Real mozarella " +
            "cheese on top of our signature pizza sauce with your choice of crust, then baked " +
            "to a golden brown.", Size.LARGE, Crust.ORIGINAL, Sauce.MARINARA,
            new Meat[]{}, new Veggie[]{})
    ,THE_WORKS("The Works Pizza", 18.99, "A heaping helping of pepperoni, " +
            "Canadian bacon, spicy Italian sausage, fresh-cut onions, crisp green peppers, " +
            "mushrooms, ripe black olives, and real mozzarella cheese.", Size.LARGE,
            Crust.ORIGINAL, Sauce.MARINARA, new Meat[]{Meat.PEPPERONI, Meat.CANADIAN_BACON,
            Meat.SAUSAGE}, new Veggie[]{Veggie.ONION, Veggie.GREEN_PEPPER, Veggie.MUSHROOM,
            Veggie.BLACK_OLIVE})
    ,MIKES_PIZZA("Mike's Pizza", 19.85, "A conglomeration of sausage, " +
            "Banana Peppers, onion, green peppers, mushrooms and roma tomatoes", Size.LARGE,
            Crust.THIN, Sauce.MARINARA, new Meat[]{Meat.SAUSAGE}, new Veggie[]{Veggie.BANANA_PEPPER,
            Veggie.ONION, Veggie.GREEN_PEPPER, Veggie.MUSHROOM, Veggie.TOMATO})
    ,THE_MEATS("The Meats Pizza", 18.99, "Packed with pepperoni, Italian sausage, ham, bacon," +
            " seasoned pork and beef, this pizza is NOT messing around.", Size.LARGE, Crust.PAN, Sauce.MARINARA,
            new Meat[]{Meat.PEPPERONI, Meat.SAUSAGE, Meat.HAM, Meat.BEEF, Meat.ITALIAN_SAUSAGE, Meat.BACON}, new Veggie[]{})
    ,BUFF_CHICKEN("Buffalo Chicken Pizza", 13.49, "Buffalo hot sauce and grilled chicken",
            Size.LARGE, Crust.ORIGINAL, Sauce.BUFFALO, new Meat[]{Meat.CHICKEN}, new Veggie[]{})
    ;

    private Pizza item;

    PizzaItem(String name, double price, String description, Size size, Crust crust, Sauce sauce, Meat[] meat, Veggie[] veggies){
        item = new Pizza(name, price, description, size, crust, sauce, meat, veggies);
    }

    public Pizza getItem() {
        return item;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
