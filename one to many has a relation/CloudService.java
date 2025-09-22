class CloudService {
    public int price;
    public ITCompany company;

    public CloudService(int price, ITCompany company) {
        this.price = price;
        this.company = company;
    }

    public void displayDetails() {
        System.out.println("Cloud Service subscription price == " + price);
        System.out.println("Company Founder == " + company.founder);
    }
}