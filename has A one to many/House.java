class House {
    public String houseName;
    public int housePrice;
    public Storage storage;

    public House(String houseName, int housePrice, Storage storage) {
        this.houseName = houseName;
        this.housePrice = housePrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("House: " + houseName + " | Price: " + housePrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}