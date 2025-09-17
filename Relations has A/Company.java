class Company {
    public String name;
    public Employee employee;

    public Company(Employee employee) {
        this.name = employee.name;
        this.employee = employee;
    }

    public void displayCompany() {
        employee.displayEmployee();
    }
}
