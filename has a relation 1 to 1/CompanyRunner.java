class CompanyRunner {
    public static void main(String[] args) {
        Department department = new Department("IT", 120);
        Company company = new Company("Infosys", "Bangalore", department);
        company.displayCompany();
    }
}
