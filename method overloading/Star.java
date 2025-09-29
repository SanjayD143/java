class Star {
    public void display(String name) {
        System.out.println("Star name==" + name);
    }
    public void display(String name, double mass) {
        System.out.println("Star name==" + name);
        System.out.println("Mass==" + mass);
    }
    public void display(String name, double mass, int temperature) {
        System.out.println("Star name==" + name);
        System.out.println("Mass==" + mass);
        System.out.println("Temperature==" + temperature);
    }
    public void display(String name, double mass, int temperature, boolean isVisible) {
        System.out.println("Star name==" + name);
        System.out.println("Mass==" + mass);
        System.out.println("Temperature==" + temperature);
        System.out.println("Visible==" + isVisible);
    }
}

