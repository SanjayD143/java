class Laptop {
    public int price;
    public Company company;

    public Laptop(int price, Company company) {
        this.price = price;
        this.company = company;
    }

    public void displayDetails() {
        System.out.println("Laptop price == " + price);
        System.out.println("Company Founder == " + company.founder);
    }
}