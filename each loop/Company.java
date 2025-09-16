class Company {
    public int employees;
    public String managerName;

    public Company(int employees, String managerName) {
        this.employees = employees;
        this.managerName = managerName;
    }

    public void companyDetails() {
        System.out.println("Company has " + employees + " employees, Manager: " + managerName);
    }
}



