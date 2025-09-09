class Building {
    public void buildingName(String name) {
        this.buildingID("Tower", 701);
        System.out.println("this is argument cons " + name);
    }
    public void buildingID(String name, int id) {
        this.buildingType("Mall", 801, 'A');
        System.out.println("this is double argument cons " + name + "," + id);
    }
    public void buildingType(String name, int id, char typeCode) {
        this.buildingFloors("Hospital", 901, 'B', 5);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + typeCode);
    }
    public void buildingFloors(String name, int id, char typeCode, int floors) {
        this.buildingHeight("School", 1001, 'C', 3, 45.5f);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + typeCode + "," + floors);
    }
    public void buildingHeight(String name, int id, char typeCode, int floors, float height) {
        this.buildingCost("Office", 1101, 'D', 10, 60.5f, 5000000L);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + typeCode + "," + floors + "," + height);
    }
    public void buildingCost(String name, int id, char typeCode, int floors, float height, long cost) {
        System.out.println("this is multiple argument cons " + name + "," + id + "," + typeCode + "," + floors + "," + height + "," + cost);
    }
}
class BuildingRunner {
    public static void main(String[] args) {
        Building building = new Building();
        building.buildingName("Skyscraper");
    }
}
