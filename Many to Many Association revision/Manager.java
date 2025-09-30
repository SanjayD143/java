class Manager {
    public String managerName;
    public Company company;

    public Manager(String managerName, Company company) {
        this.managerName = managerName;
        this.company = company;
    }

    public void displayDetails() {
        System.out.println("Manager Name == " + managerName);
        System.out.println("Company == " + company.companyName);
    }
}