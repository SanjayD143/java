class FruitRunner {
    public static void main(String[] args) {
        Storage storage1 = new Storage("Cold Storage", 3000);
        Storage storage2 = new Storage("Fresh Basket", 1500);

        Apple apple = new Apple("Kashmiri Apple", 120, storage1);
        Banana banana = new Banana("Yelakki Banana", 60, storage2);
        Mango mango = new Mango("Alphonso Mango", 250, storage1);
        Orange orange = new Orange("Nagpur Orange", 80, storage2);
        Grapes grapes = new Grapes("Seedless Grapes", 150, storage1);

        apple.displayDetails();
        banana.displayDetails();
        mango.displayDetails();
        orange.displayDetails();
        grapes.displayDetails();
    }
}