class Manager {
    public String managerName;
    public int teamSize;
    public Employee employee;

    public Manager(String managerName, int teamSize, Employee employee) {
        this.managerName = managerName;
        this.teamSize = teamSize;
        this.employee = employee;
    }

    public void displayManager() {
        System.out.println("Manager: " + managerName +", Team Size: " + teamSize +", Employee: " + employee.employeeName +", Salary: " + employee.salary);
    }
}
