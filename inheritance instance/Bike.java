class Bike extends Car {
    public static void setPrice() {
        carPrice = 500000;
        System.out.println("This is car price: " + carPrice);
    }

    public void displayCar() {
        carName = "Tesla Model S";
        System.out.println("This is car name: " + carName);
    }
}