class Gadget {
    public Gadget() {
        this(5000);
        System.out.println("No-argument Gadget constructor");
    }
    public Gadget(int price) {
        this(100, "SmartWatch");
        System.out.println("Price=" + price);
    }
    public Gadget(int weight, String name) {
        this(200, true, "Tablet");
        System.out.println("Weight=" + weight);
        System.out.println("Name=" + name);
    }
    public Gadget(int batteryLife, boolean isSmart, String model) {
        this(5.5, 7.8f, 123456789L);
        System.out.println("Battery Life=" + batteryLife);
        System.out.println("isSmart=" + isSmart);
        System.out.println("Model=" + model);
    }
    public Gadget(double height, float width, long serialNumber) {
        System.out.println("Height=" + height);
        System.out.println("Width=" + width);
        System.out.println("Serial Number=" + serialNumber);
    }
}


