class Zomato {
    public int deliveryCharge;
    public FoodDeliveryCompany company;

    public Zomato(int deliveryCharge, FoodDeliveryCompany company) {
        this.deliveryCharge = deliveryCharge;
        this.company = company;
    }

    public void displayDetails() {
        System.out.println("Zomato delivery charge == " + deliveryCharge);
        System.out.println("Company Founder == " + company.founder);
    }
}