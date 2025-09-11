class Mobile {
    public String[] mobileBrands = {"Samsung", "Apple", "OnePlus", "Vivo"};

    public void mobileName() {
        System.out.println("Total Mobiles = " + mobileBrands.length);
        for (int brand = 0; brand < mobileBrands.length; brand++) {
            System.out.println("Mobile Brand = " + mobileBrands[brand]);
        }
    }
}