class Laptop {
    public String[] laptopBrands = {"Dell", "HP", "Lenovo", "Asus"};

    public void laptopName() {
        System.out.println("Total Laptops = " + laptopBrands.length);
        for (int brand = 0; brand < laptopBrands.length; brand++) {
            System.out.println("Laptop Brand = " + laptopBrands[brand]);
        }
    }
}