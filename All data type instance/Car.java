class Car {
    public int price;

    public void carInfo() {
        int doors = 4;
        System.out.println("Doors: " + doors);

        long carID = 123987L;
        System.out.println("Car ID: " + carID);

        char grade = 'A';
        System.out.println("Grade: " + grade);

        float engineCapacity = 2.0f;
        System.out.println("Engine Capacity: " + engineCapacity);

        boolean isElectric = false;
        System.out.println("Is Electric: " + isElectric);

        double mileage = 18.5;
        System.out.println("Mileage: " + mileage);

        String name = "Tesla";
        System.out.println("Name: " + name);

        price = 50000;
        System.out.println("Price: " + price);
    }
}
class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.carInfo();
    }
}
