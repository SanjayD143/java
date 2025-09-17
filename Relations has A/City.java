class City {
    public String name;
    public Building building;

    public City(Building building) {
        this.name = building.name;
        this.building = building;
    }

    public void displayCity() {
        building.displayBuilding();
    }
}
