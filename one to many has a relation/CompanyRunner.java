class CompanyRunner {
    public static void main(String[] args) {
        Company company = new Company("Sundar Pichai");

        Laptop laptop = new Laptop(55000, company);
        Mobile mobile = new Mobile(30000, company);
        Tablet tablet = new Tablet(25000, company);

        laptop.displayDetails();
        mobile.displayDetails();
        tablet.displayDetails();
    }
}