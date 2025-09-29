class ComputerComponent {
    public void display(String componentName) {
        System.out.println("Component Name==" + componentName);
    }
    public void display(String componentName, int componentID) {
        System.out.println("Component Name==" + componentName);
        System.out.println("Component ID==" + componentID);
    }
    public void display(String componentName, int componentID, double price) {
        System.out.println("Component Name==" + componentName);
        System.out.println("Component ID==" + componentID);
        System.out.println("Price==" + price);
    }
    public void display(String componentName, int componentID, double price, boolean isFunctional) {
        System.out.println("Component Name==" + componentName);
        System.out.println("Component ID==" + componentID);
        System.out.println("Price==" + price);
        System.out.println("Functional==" + isFunctional);
    }
}

