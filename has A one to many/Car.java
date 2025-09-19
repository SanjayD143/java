class Car {
    public String carName;
    public int carPrice;
    public Storage storage;

    public Car(String carName, int carPrice, Storage storage) {
        this.carName = carName;
        this.carPrice = carPrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Car: " + carName + " | Price: " + carPrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}