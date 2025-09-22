class Tablet {
    public int price;
    public Company company;

    public Tablet(int price, Company company) {
        this.price = price;
        this.company = company;
    }

    public void displayDetails() {
        System.out.println("Tablet price == " + price);
        System.out.println("Company Founder == " + company.founder);
    }
}