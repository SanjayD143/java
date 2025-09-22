class Software {
    public int price;
    public ITCompany company;

    public Software(int price, ITCompany company) {
        this.price = price;
        this.company = company;
    }

    public void displayDetails() {
        System.out.println("Software license price == " + price);
        System.out.println("Company Founder == " + company.founder);
    }
}