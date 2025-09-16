class Manager {
    public void managerDetails(Company[] companies) {
        for (Company company : companies) {
            company.companyDetails();
        }
    }
}