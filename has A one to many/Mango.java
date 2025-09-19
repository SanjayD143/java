
class Mango {
    public String mangoName;
    public int mangoPrice;
    public Storage storage;

    public Mango(String mangoName, int mangoPrice, Storage storage) {
        this.mangoName = mangoName;
        this.mangoPrice = mangoPrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Mango: " + mangoName + " | Price: " + mangoPrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}