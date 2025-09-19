class Cycle {
    public String cycleName;
    public int cyclePrice;
    public Storage storage;

    public Cycle(String cycleName, int cyclePrice, Storage storage) {
        this.cycleName = cycleName;
        this.cyclePrice = cyclePrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Cycle: " + cycleName + " | Price: " + cyclePrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}
