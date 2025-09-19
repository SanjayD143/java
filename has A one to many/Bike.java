class Bike {
    public String bikeName;
    public int bikePrice;
    public Storage storage;

    public Bike(String bikeName, int bikePrice, Storage storage) {
        this.bikeName = bikeName;
        this.bikePrice = bikePrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Bike: " + bikeName + " | Price: " + bikePrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}