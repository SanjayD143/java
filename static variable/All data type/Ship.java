class Ship {
    public int capacity;

    public void shipInfo() {
        int decks = 10;
        System.out.println("Decks: " + decks);

        long shipID = 987654L;
        System.out.println("Ship ID: " + shipID);

        char type = 'C';
        System.out.println("Type: " + type);

        float tonnage = 5000.5f;
        System.out.println("Tonnage: " + tonnage);

        boolean inService = true;
        System.out.println("In Service: " + inService);

        double speed = 30.75;
        System.out.println("Speed: " + speed);

        String name = "Titanic";
        System.out.println("Name: " + name);

        capacity = 3000;
        System.out.println("Capacity: " + capacity);
    }
}
class ShipRunner {
    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.shipInfo();
    }
}
