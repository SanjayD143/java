class Employee {
    public String employeeName;
    public Company company;

    public Employee(String employeeName, Company company) {
        this.employeeName = employeeName;
        this.company = company;
    }

    public void displayDetails() {
        System.out.println("Employee Name == " + employeeName);
        System.out.println("Company == " + company.companyName);
    }
}