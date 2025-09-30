class Project {
    public String projectName;
    public Manager manager;
    public Employee employee;

    public Project(String projectName, Manager manager, Employee employee) {
        this.projectName = projectName;
        this.manager = manager;
        this.employee = employee;
    }

    public void displayDetails() {
        System.out.println("Project Name == " + projectName);
        System.out.println("Manager == " + manager.managerName);
        System.out.println("Employee == " + employee.employeeName);
        System.out.println("Company == " + employee.company.companyName);
    }
}