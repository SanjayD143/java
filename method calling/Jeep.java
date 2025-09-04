class Jeep {
    public int wheels;

    public void engine() {
        System.out.println("Jeep has an engine");
    }

    public void fuelType() {
        System.out.println("Jeep runs on Diesel");
        engine();
    }

    public void capacity() {
        System.out.println("Jeep seating capacity: 7");
        fuelType();
    }

    public void speed() {
        System.out.println("Jeep speed: 160 km/h");
        capacity();
    }

    public void type() {
        System.out.println("This is a Jeep with " + wheels + " wheels");
        speed();
    }
}


