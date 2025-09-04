class Scooter {
    public int wheels;

    public void engine() {
        System.out.println("Scooter has an engine");
    }

    public void fuelType() {
        System.out.println("Scooter runs on Petrol/Electric");
        engine();
    }

    public void capacity() {
        System.out.println("Scooter seating capacity: 2");
        fuelType();
    }

    public void speed() {
        System.out.println("Scooter speed: 80 km/h");
        capacity();
    }

    public void type() {
        System.out.println("This is a Scooter with " + wheels + " wheels");
        speed();
    }
}


