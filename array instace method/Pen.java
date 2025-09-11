class Pen {
    public String[] penBrands = {"Parker", "Cello", "Reynolds", "Pilot"};

    public void penName() {
        System.out.println("Total Pens = " + penBrands.length);
        for (int brand = 0; brand < penBrands.length; brand++) {
            System.out.println("Pen Brand = " + penBrands[brand]);
        }
    }
}
