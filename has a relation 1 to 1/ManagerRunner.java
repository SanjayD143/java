class ManagerRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("Ramesh", 50000);
        Manager manager = new Manager("Kumar", 10, employee);
        manager.displayManager();
    }
}
