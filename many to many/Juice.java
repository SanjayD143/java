class Juice {
    public String flavor;
    public int price;
    public Cafe cafe;

    public Juice(String flavor, int price, Cafe cafe) {
        this.flavor = flavor;
        this.price = price;
        this.cafe = cafe;
    }

    public void displayDetails() {
        System.out.println("Juice flavor == " + flavor);
        System.out.println("Price == " + price);
        System.out.println("Cafe Owner == " + cafe.ownerName);
    }
}