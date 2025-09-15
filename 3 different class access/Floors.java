class Floors {
    public String floorName;
    public int floorNumbers;

    // Constructor
    public Floors(int floorNumbers, String floorName) {
        this.floorNumbers = floorNumbers;
        this.floorName = floorName;
    }

    public void displayFloors() {
        System.out.println("Floor Number: " + floorNumbers);
        System.out.println("Floor Name: " + floorName);
    }
}