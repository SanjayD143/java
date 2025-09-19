 class VehicleRunner {
    public static void main(String[] args) {
        Storage storage1 = new Storage("Engine", 50000);
        Storage storage2 = new Storage("Gearbox", 20000);

        Car car = new Car("Honda City", 1200000, storage1);
        Bike bike = new Bike("Royal Enfield", 200000, storage2);
        Bus bus = new Bus("Volvo", 3000000, storage1);
        Truck truck = new Truck("Tata Truck", 1500000, storage2);
        Cycle cycle = new Cycle("Hero Cycle", 15000, storage1);

        car.displayDetails();
        bike.displayDetails();
        bus.displayDetails();
        truck.displayDetails();
        cycle.displayDetails();
    }
}