class Hardware {
    public int price;
    public ITCompany company;

    public Hardware(int price, ITCompany company) {
        this.price = price;
        this.company = company;
    }

    public void displayDetails() {
        System.out.println("Hardware device price == " + price);
        System.out.println("Company Founder == " + company.founder);
    }
}