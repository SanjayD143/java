class CafeRunner {
    public static void main(String[] args) {
        Cafe cafe = new Cafe("John Doe");

        Coffee coffee = new Coffee("Espresso", 150, cafe);
        Pastry pastry = new Pastry("Chocolate", 120, cafe);
        Sandwich sandwich = new Sandwich("Veggie", 180, cafe);
        Juice juice = new Juice("Orange", 100, cafe);
        Dessert dessert = new Dessert("Brownie", 90, cafe);

        coffee.displayDetails();
        pastry.displayDetails();
        sandwich.displayDetails();
        juice.displayDetails();
        dessert.displayDetails();
    }
}