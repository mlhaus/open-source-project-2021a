package com.hauschildt;

public enum PizzaItem {
    PEPPERONI("Pepperoni Pizza", 13.49, "Your choice of crust covered " +
            "with our signature pizza sauce, real mozzarella cheese, and pepperoni. It's one " +
            "of our most popular pizzas.", Size.LARGE, Crust.ORIGINAL, Sauce.MARINARA,
            new Meat[]{Meat.PEPPERONI}, new Veggie[]{})
    ,SAUSAGE("Sausage Pizza", 13.49, "Our signature pizza sauce layered " +
            "with sausage and real mozzarella cheese. Your choice of crust.", Size.LARGE,
            Crust.ORIGINAL, Sauce.MARINARA, new Meat[]{Meat.SAUSAGE}, new Veggie[]{})
    ,CHEESE("Cheese Pizza", 12.99, "Simple, yet delicious. Real mozzarella " +
            "cheese on top of our signature pizza sauce with your choice of crust, then baked " +
            "to a golden brown.", Size.LARGE, Crust.ORIGINAL, Sauce.MARINARA,
            new Meat[]{}, new Veggie[]{})
    ,MEAT("Meat Lovers Pizza", 12.99, "Our signature pizza sauce layered with pepperoni, sausage, " +
            "canadian bacon, and bacon bits",
            Size.LARGE, Crust.STUFFED, Sauce.MARINARA,
            new Meat[]{Meat.PEPPERONI, Meat.SAUSAGE, Meat.CANADIAN_BACON, Meat.BACON}, new Veggie[]{})
    ,THE_WORKS("The Works Pizza", 18.99, "A heaping helping of pepperoni, " +
            "Canadian bacon, spicy Italian sausage, fresh-cut onions, crisp green peppers, " +
            "mushrooms, ripe black olives, and real mozzarella cheese.", Size.LARGE,
            Crust.ORIGINAL, Sauce.MARINARA, new Meat[]{Meat.PEPPERONI, Meat.CANADIAN_BACON,
            Meat.SAUSAGE}, new Veggie[]{Veggie.ONION, Veggie.GREEN_PEPPER, Veggie.MUSHROOM,
            Veggie.BLACK_OLIVE})
    ,GRINDER("Grinder Pizza", 22.75, "A special blend of sausage and beef " +
            "topped with onions, jalapenos, mozzarella, & cheddar cheese.", Size.LARGE, Crust.ORIGINAL,
            Sauce.MARINARA, new Meat[]{Meat.SAUSAGE, Meat.BEEF}, new Veggie[]{Veggie.ONION, Veggie.JALAPENO})
    , ANCHOVY("Anchovy", 13.49, "Our signature pizza sauce layered " +
            "with anchovy and real mozzarella cheese. Your choice of crust.", Size.LARGE,
            Crust.ORIGINAL, Sauce.MARINARA, new Meat[]{Meat.ANCHOVY}, new Veggie[]{})
    ,VEGAN_SUPREME("Vegan Supreme pizza",21.99,"Plant based sausage with pineapple, onions " +
            "black olives, mushrooms, green pepper, tomatoes, and dairy free cheese", Size.LARGE, Crust.ORIGINAL,
            Sauce.MARINARA, new Meat[]{Meat.VEGAN_SAUSAGE}, new Veggie[]{Veggie.ONION, Veggie.BLACK_OLIVE,
            Veggie.GREEN_PEPPER, Veggie.MUSHROOM, Veggie.PINEAPPLE, Veggie.TOMATO})
    , REUBEN("Reuben", 13.99, "Our delicious take on the classic sandwich. Corned beef " +
            "sauerkraut, and thousand island dressing topped with swiss cheese.", Size.LARGE, Crust.ORIGINAL,
            Sauce.THOUSAND_ISLAND, new Meat[]{Meat.CORNED_BEEF}, new Veggie[]{Veggie.SAUERKRAUT})
    ,MEAT_LOVERS("Super Carnivore Pizza", 18.99, "All the meat you could want with no vegetables. "+
            "Classic pepperoni, spicy Italian sausage, bacon, Canadian bacon, and smokey grilled chicken. All on top of" +
            "fresh mozzarella cheese and marinara sauce.", Size.EXTRA_LARGE, 
            Crust.ORIGINAL, Sauce.MARINARA, new Meat[]{Meat.BACON, Meat.CANADIAN_BACON, Meat.CHICKEN,
            Meat.PEPPERONI, Meat.SAUSAGE}, new Veggie[]{})
    ,THAI_VEGGIE("Thai Veggie Pizza", 15.00,
            "Thai peanut sauce, red onion, carrot, fresh red pepper, pineapple," +
                    "green pepper, and monterrey jack, topped with sesame seeds.", Size.LARGE, Crust.THIN,
            Sauce.THAI_PEANUT, new Meat[]{}, new Veggie[]{Veggie.RED_ONION, Veggie.CARROT, Veggie.RED_PEPPER,
            Veggie.PINEAPPLE, Veggie.GREEN_PEPPER, Veggie.SESAME_SEEDS})
    ,MIKES_PIZZA("Mike's Pizza", 19.85, "A conglomeration of sausage, " +
            "Banana Peppers, onion, green peppers, mushrooms and roma tomatoes", Size.LARGE,
            Crust.THIN, Sauce.MARINARA, new Meat[]{Meat.SAUSAGE}, new Veggie[]{Veggie.BANANA_PEPPER,
            Veggie.ONION, Veggie.GREEN_PEPPER, Veggie.MUSHROOM, Veggie.TOMATO})
    ,THE_MEATS("The Meats Pizza", 18.99, "Packed with pepperoni, Italian sausage, ham, bacon," +
            " seasoned pork and beef, this pizza is NOT messing around.", Size.LARGE, Crust.PAN, Sauce.MARINARA,
            new Meat[]{Meat.PEPPERONI, Meat.SAUSAGE, Meat.HAM, Meat.BEEF, Meat.ITALIAN_SAUSAGE, Meat.BACON}, new Veggie[]{})
    ,BUFF_CHICKEN("Buffalo Chicken Pizza", 13.49, "Buffalo hot sauce and grilled chicken",
            Size.LARGE, Crust.ORIGINAL, Sauce.BUFFALO, new Meat[]{Meat.CHICKEN}, new Veggie[]{})
    ,LIAMS_PIZZA("Liams Pizza", 20.00, "This ginormous pizza has lots of pepperoni, canadian bacon, sausage, and mozzarella " +
            "cheese.", Size.EXTRA_LARGE, Crust.THIN, Sauce.MARINARA, new Meat[]{Meat.PEPPERONI, Meat.CANADIAN_BACON, Meat.SAUSAGE},
            new Veggie[]{})
    ,BBQ_CHICKEN("Barbeque Chicken Pizza", 16.99, "Starts with BBQ sauce and is topped with grilled " +
            "chicken, smoked bacon, onion, and mozzarella cheese.", Size.LARGE, Crust.ORIGINAL, Sauce.BBQ,
            new Meat[]{Meat.CHICKEN, Meat.BACON}, new Veggie[]{Veggie.ONION})

    ,BBQ_CHICKEN2("BBQ Chicken Pizza", 16.99, "Smothered in smoky BBQ sauce, it’s topped with grilled chicken, " +
            "hickory-smoked bacon, Red onions and Pineapple",
                 Size.LARGE, Crust.ORIGINAL, Sauce.BBQ, new Meat[]{Meat.CHICKEN, Meat.BACON}, new Veggie[]{Veggie.RED_ONION,
    Veggie.PINEAPPLE})
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
