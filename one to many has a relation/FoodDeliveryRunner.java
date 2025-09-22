class FoodDeliveryRunner {
    public static void main(String[] args) {
        FoodDeliveryCompany company = new FoodDeliveryCompany("Deepinder Goyal");

        Zomato zomato = new Zomato(40, company);
        Swiggy swiggy = new Swiggy(30, company);
        UberEats uberEats = new UberEats(50, company);

        zomato.displayDetails();
        swiggy.displayDetails();
        uberEats.displayDetails();
    }
}