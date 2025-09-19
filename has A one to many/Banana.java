class Banana {
    public String bananaName;
    public int bananaPrice;
    public Storage storage;

    public Banana(String bananaName, int bananaPrice, Storage storage) {
        this.bananaName = bananaName;
        this.bananaPrice = bananaPrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Banana: " + bananaName + " | Price: " + bananaPrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}