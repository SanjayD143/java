class Mall {
    public String mallName;
    public int mallPrice;
    public Storage storage;

    public Mall(String mallName, int mallPrice, Storage storage) {
        this.mallName = mallName;
        this.mallPrice = mallPrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Mall: " + mallName + " | Price: " + mallPrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}
