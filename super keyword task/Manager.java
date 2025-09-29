class Manager extends Employee {
    public Manager(String empName, int empId, double salary) {
        super.empName = empName;
        super.empId = empId;
        super.salary = salary;
    }

    public void display() {
        System.out.println("Manager Name: " + empName + ", ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}