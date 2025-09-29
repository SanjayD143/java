class Asteroid {
    public void display(String name) {
        System.out.println("Asteroid name==" + name);
    }
    public void display(String name, long distance) {
        System.out.println("Asteroid name==" + name);
        System.out.println("Distance from Earth==" + distance);
    }
    public void display(String name, long distance, double mass) {
        System.out.println("Asteroid name==" + name);
        System.out.println("Distance from Earth==" + distance);
        System.out.println("Mass==" + mass);
    }
    public void display(String name, long distance, double mass, boolean isDangerous) {
        System.out.println("Asteroid name==" + name);
        System.out.println("Distance from Earth==" + distance);
        System.out.println("Mass==" + mass);
        System.out.println("Dangerous==" + isDangerous);
    }
}

