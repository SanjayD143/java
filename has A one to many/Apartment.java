class Apartment {
    public String apartmentName;
    public int apartmentPrice;
    public Storage storage;

    public Apartment(String apartmentName, int apartmentPrice, Storage storage) {
        this.apartmentName = apartmentName;
        this.apartmentPrice = apartmentPrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Apartment: " + apartmentName + " | Price: " + apartmentPrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}