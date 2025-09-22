class Swiggy {
    public int deliveryCharge;
    public FoodDeliveryCompany company;

    public Swiggy(int deliveryCharge, FoodDeliveryCompany company) {
        this.deliveryCharge = deliveryCharge;
        this.company = company;
    }

    public void displayDetails() {
        System.out.println("Swiggy delivery charge == " + deliveryCharge);
        System.out.println("Company Founder == " + company.founder);
    }
}