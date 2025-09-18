class Company {
    public String companyName;
    public String location;
    public Department department;

    public Company(String companyName, String location, Department department) {
        this.companyName = companyName;
        this.location = location;
        this.department = department;
    }

    public void displayCompany() {
        System.out.println("Company: " + companyName +", Location: " + location +", Department: " + department.deptName +", Employees: " + department.noOfEmployees);
    }
}
