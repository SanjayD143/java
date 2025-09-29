class Plant {
    public Plant() {
        this("Rose");
        System.out.println("No-argument Plant constructor");
    }
    public Plant(String species) {
        this(12, true);
        System.out.println("Species=" + species);
    }
    public Plant(int age, boolean isIndoor) {
        this(50.5, 30.2f, "Greenhouse");
        System.out.println("Age=" + age);
        System.out.println("isIndoor=" + isIndoor);
    }
    public Plant(double height, float width, String location) {
        System.out.println("Height=" + height);
        System.out.println("Width=" + width);
        System.out.println("Location=" + location);
    }
}


