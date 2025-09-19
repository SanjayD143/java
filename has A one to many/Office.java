class Office {
    public String officeName;
    public int officePrice;
    public Storage storage;

    public Office(String officeName, int officePrice, Storage storage) {
        this.officeName = officeName;
        this.officePrice = officePrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Office: " + officeName + " | Price: " + officePrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}