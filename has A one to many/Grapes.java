class Grapes {
    public String grapesName;
    public int grapesPrice;
    public Storage storage;

    public Grapes(String grapesName, int grapesPrice, Storage storage) {
        this.grapesName = grapesName;
        this.grapesPrice = grapesPrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Grapes: " + grapesName + " | Price: " + grapesPrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}