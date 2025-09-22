class ITCompanyRunner {
    public static void main(String[] args) {
        ITCompany company = new ITCompany("Satya Nadella");

        Software software = new Software(15000, company);
        Hardware hardware = new Hardware(55000, company);
        CloudService cloudService = new CloudService(20000, company);

        software.displayDetails();
        hardware.displayDetails();
        cloudService.displayDetails();
    }
}