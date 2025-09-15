class AppartmentRunner {
    public static void main(String[] args) {
        Appartment appartment = new Appartment();

        // Create Floors objects
        Floors floor = new Floors(100, "Kadri");
        Floors floorOne = new Floors(200, "Mangalore");
        Floors floorTwo = new Floors(300, "Bengaluru");
        Floors floorThree = new Floors(400, "Mysuru");

        // Store them in an array
        Floors[] floors = { floor, floorOne, floorTwo, floorThree };

        // Pass array to appartmentDisplay
        appartment.appartmentDisplay(floors);
    }
}