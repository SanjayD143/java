class Television {
    public String[] tvBrands = {"Sony", "Samsung", "LG", "Panasonic"};

    public void tvName() {
        System.out.println("Total Televisions = " + tvBrands.length);
        for (int brand = 0; brand < tvBrands.length; brand++) {
            System.out.println("Television Brand = " + tvBrands[brand]);
        }
    }
}