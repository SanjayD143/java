class Dessert {
    public String name;
    public int price;
    public Cafe cafe;

    public Dessert(String name, int price, Cafe cafe) {
        this.name = name;
        this.price = price;
        this.cafe = cafe;
    }

    public void displayDetails() {
        System.out.println("Dessert name == " + name);
        System.out.println("Price == " + price);
        System.out.println("Cafe Owner == " + cafe.ownerName);
    }
}