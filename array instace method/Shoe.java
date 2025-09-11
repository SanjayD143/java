class Shoe {
    public String[] shoeBrands = {"Nike", "Adidas", "Puma", "Reebok"};

    public void shoeName() {
        System.out.println("Total Shoes = " + shoeBrands.length);
        for (int brand = 0; brand < shoeBrands.length; brand++) {
            System.out.println("Shoe Brand = " + shoeBrands[brand]);
        }
    }
}
