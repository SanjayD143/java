class Apple extends Fruit {
    public Apple(String fruitName, String color, double pricePerKg) {
        super.fruitName = fruitName;
        super.color = color;
        super.pricePerKg = pricePerKg;
    }

    public void display() {
        System.out.println("Fruit Name: " + fruitName);
        System.out.println("Color: " + color);
        System.out.println("Price per Kg: " + pricePerKg);
    }
}