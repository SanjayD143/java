class Chair {
    public String chairName;
    public int chairPrice;
    public Storage storage;

    public Chair(String chairName, int chairPrice, Storage storage) {
        this.chairName = chairName;
        this.chairPrice = chairPrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Chair: " + chairName + " | Price: " + chairPrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}