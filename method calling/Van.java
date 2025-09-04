class Van {
    public int wheels;

    public void engine() {
        System.out.println("Van has an engine");
    }

    public void fuelType() {
        System.out.println("Van runs on Petrol/Diesel");
        engine();
    }

    public void capacity() {
        System.out.println("Van seating capacity: 12");
        fuelType();
    }

    public void speed() {
        System.out.println("Van speed: 120 km/h");
        capacity();
    }

    public void type() {
        System.out.println("This is a Van with " + wheels + " wheels");
        speed();
    }
}


