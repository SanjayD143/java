class Bag {
    public String[] bagBrands = {"American Tourister", "Wildcraft", "Skybags", "Nike"};

    public void bagName() {
        System.out.println("Total Bags = " + bagBrands.length);
        for (int brand = 0; brand < bagBrands.length; brand++) {
            System.out.println("Bag Brand = " + bagBrands[brand]);
        }
    }
}