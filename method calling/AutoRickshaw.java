class AutoRickshaw {
    public int wheels;

    public void engine() {
        System.out.println("AutoRickshaw has an engine");
    }

    public void fuelType() {
        System.out.println("AutoRickshaw runs on CNG/Petrol");
        engine();
    }

    public void capacity() {
        System.out.println("AutoRickshaw seating capacity: 3 passengers");
        fuelType();
    }

    public void speed() {
        System.out.println("AutoRickshaw speed: 70 km/h");
        capacity();
    }

    public void type() {
        System.out.println("This is an AutoRickshaw with " + wheels + " wheels");
        speed();
    }
}


