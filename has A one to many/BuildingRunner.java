 class BuildingRunner {
    public static void main(String[] args) {
        Storage storage1 = new Storage("Parking Lot", 50000);
        Storage storage2 = new Storage("Security System", 20000);

        House house = new House("Villa Paradise", 4500000, storage1);
        Apartment apartment = new Apartment("Skyline Towers", 6000000, storage2);
        Office office = new Office("Tech Park", 12000000, storage1);
        Mall mall = new Mall("City Center", 25000000, storage2);
        School school = new School("Green Valley School", 8000000, storage1);

        house.displayDetails();
        apartment.displayDetails();
        office.displayDetails();
        mall.displayDetails();
        school.displayDetails();
    }
}