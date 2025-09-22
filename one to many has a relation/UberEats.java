class UberEats {
    public int deliveryCharge;
    public FoodDeliveryCompany company;

    public UberEats(int deliveryCharge, FoodDeliveryCompany company) {
        this.deliveryCharge = deliveryCharge;
        this.company = company;
    }

    public void displayDetails() {
        System.out.println("UberEats delivery charge == " + deliveryCharge);
        System.out.println("Company Founder == " + company.founder);
    }
}