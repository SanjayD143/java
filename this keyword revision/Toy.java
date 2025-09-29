class Toy {
    public Toy() {
        this(100);
        System.out.println("No-argument Toy constructor");
    }
    public Toy(int price) {
        this("Car");
        System.out.println("Price=" + price);
    }
    public Toy(String type) {
        this(true, 5);
        System.out.println("Type=" + type);
    }
    public Toy(boolean isElectronic, int ageGroup) {
        System.out.println("isElectronic=" + isElectronic);
        System.out.println("Age Group=" + ageGroup);
    }
}


