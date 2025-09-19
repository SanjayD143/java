class Bus {
    public String busName;
    public int busPrice;
    public Storage storage;

    public Bus(String busName, int busPrice, Storage storage) {
        this.busName = busName;
        this.busPrice = busPrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Bus: " + busName + " | Price: " + busPrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}