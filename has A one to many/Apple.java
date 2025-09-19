class Apple {
    public String appleName;
    public int applePrice;
    public Storage storage;

    public Apple(String appleName, int applePrice, Storage storage) {
        this.appleName = appleName;
        this.applePrice = applePrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Apple: " + appleName + " | Price: " + applePrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}