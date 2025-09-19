class Pen {
    public String penName;
    public int penPrice;
    public Storage storage;

    public Pen(String penName, int penPrice, Storage storage) {
        this.penName = penName;
        this.penPrice = penPrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Pen: " + penName + " | Price: " + penPrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}