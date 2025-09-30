class Department {
    public String departmentName;
    public Employee employee;
    public Manager manager;
    public Project project;

    public Department(String departmentName, Employee employee, Manager manager, Project project) {
        this.departmentName = departmentName;
        this.employee = employee;
        this.manager = manager;
        this.project = project;
    }

    public void displayDetails() {
        System.out.println("Department Name == " + departmentName);
        System.out.println("Employee == " + employee.employeeName);
        System.out.println("Manager == " + manager.managerName);
        System.out.println("Project == " + project.projectName);
        System.out.println("Company == " + employee.company.companyName);
    }
}