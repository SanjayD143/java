class Bag {
    public String bagName;
    public int bagPrice;
    public Storage storage;

    public Bag(String bagName, int bagPrice, Storage storage) {
        this.bagName = bagName;
        this.bagPrice = bagPrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Bag: " + bagName + " | Price: " + bagPrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}