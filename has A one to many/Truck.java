class Truck {
    public String truckName;
    public int truckPrice;
    public Storage storage;

    public Truck(String truckName, int truckPrice, Storage storage) {
        this.truckName = truckName;
        this.truckPrice = truckPrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Truck: " + truckName + " | Price: " + truckPrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}