class BuildingRunner {
    public static void main(String[] args) {
        House house = new House(2, "MG Road, Bangalore", 'R', 1200.0, 202L,
                                10.5f, false,
                                5, "Suresh", 'W', 7500000.0,
                                9988776655L, 25000.0f, true);
        house.displayHouse();
    }
}
