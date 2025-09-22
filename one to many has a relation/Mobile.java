class Mobile {
    public int price;
    public Company company;

    public Mobile(int price, Company company) {
        this.price = price;
        this.company = company;
    }

    public void displayDetails() {
        System.out.println("Mobile price == " + price);
        System.out.println("Company Founder == " + company.founder);
    }
}