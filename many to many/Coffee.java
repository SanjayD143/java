class Coffee {
    public String type;
    public int price;
    public Cafe cafe;

    public Coffee(String type, int price, Cafe cafe) {
        this.type = type;
        this.price = price;
        this.cafe = cafe;
    }

    public void displayDetails() {
        System.out.println("Coffee type == " + type);
        System.out.println("Price == " + price);
        System.out.println("Cafe Owner == " + cafe.ownerName);
    }
}