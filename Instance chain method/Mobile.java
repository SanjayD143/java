class Mobile {
    public void mobileName(String name) {
        this.mobileID("Samsung", 801);
        System.out.println("this is argument cons " + name);
    }
    public void mobileID(String name, int id) {
        this.mobileBrand("iPhone", 901, 'A');
        System.out.println("this is double argument cons " + name + "," + id);
    }
    public void mobileBrand(String name, int id, char brandCode) {
        this.mobilePrice("OnePlus", 1001, 'B', 50000L);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + brandCode);
    }
    public void mobilePrice(String name, int id, char brandCode, long price) {
        this.mobileWeight("Nokia", 1101, 'C', 30000L, 180.5f);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + brandCode + "," + price);
    }
    public void mobileWeight(String name, int id, char brandCode, long price, float weight) {
        this.mobileBattery("Redmi", 1201, 'D', 25000L, 150.2f, 5000);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + brandCode + "," + price + "," + weight);
    }
    public void mobileBattery(String name, int id, char brandCode, long price, float weight, int battery) {
        System.out.println("this is multiple argument cons " + name + "," + id + "," + brandCode + "," + price + "," + weight + "," + battery);
    }
}

