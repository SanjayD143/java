class Device {
    public Device() {
        this("Laptop");
        System.out.println("No-argument Device constructor");
    }
    public Device(String name) {
        this(16, true);
        System.out.println("Name=" + name);
    }
    public Device(int memory, boolean isPortable) {
        this(2.5, 3.0f, "ModelX");
        System.out.println("Memory=" + memory + "GB");
        System.out.println("isPortable=" + isPortable);
    }
    public Device(double height, float width, String model) {
        System.out.println("Height=" + height);
        System.out.println("Width=" + width);
        System.out.println("Model=" + model);
    }
}



