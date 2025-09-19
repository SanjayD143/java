
class Orange {
    public String orangeName;
    public int orangePrice;
    public Storage storage;

    public Orange(String orangeName, int orangePrice, Storage storage) {
        this.orangeName = orangeName;
        this.orangePrice = orangePrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Orange: " + orangeName + " | Price: " + orangePrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}