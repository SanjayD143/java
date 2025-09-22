class TravelPackage {
    public String packageName;
    public int packagePrice;
    public TravelAgency agency;

    public TravelPackage(String packageName, int packagePrice, TravelAgency agency) {
        this.packageName = packageName;
        this.packagePrice = packagePrice;
        this.agency = agency;
    }

    public void displayDetails() {
        System.out.println("Travel Package == " + packageName);
        System.out.println("Package Price == " + packagePrice);
        System.out.println("Travel Agency Founder == " + agency.founder);
    }
}