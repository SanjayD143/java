class CompanyRunner {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Company c1 = new Company(1000, "Arun");
        Company c2 = new Company(800, "Deepak");

        Company[] companies = {c1, c2};
        manager.managerDetails(companies);
    }
}
