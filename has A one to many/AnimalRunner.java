 class AnimalRunner {
    public static void main(String[] args) {
        Storage storage1 = new Storage("Meat", 5000);
        Storage storage2 = new Storage("Milk", 2000);

        Dog dog = new Dog("Tommy", 5, storage1);
        Cat cat = new Cat("Kitty", 3, storage2);
        Tiger tiger = new Tiger("Shera", 7, storage1);
        Elephant elephant = new Elephant("Gajraj", 15, storage2);
        Snake snake = new Snake("Cobra", 2, storage1);

        dog.displayDetails();
        cat.displayDetails();
        tiger.displayDetails();
        elephant.displayDetails();
        snake.displayDetails();
    }
}