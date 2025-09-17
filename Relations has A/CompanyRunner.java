class CompanyRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("Alice");
        Company company = new Company(employee);
        company.displayCompany();
    }
}
