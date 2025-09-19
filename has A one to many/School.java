class School {
    public String schoolName;
    public int schoolPrice;
    public Storage storage;

    public School(String schoolName, int schoolPrice, Storage storage) {
        this.schoolName = schoolName;
        this.schoolPrice = schoolPrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("School: " + schoolName + " | Price: " + schoolPrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}