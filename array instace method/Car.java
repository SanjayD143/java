class Car {
    public String[] carBrands = {"Tesla", "BMW", "Audi", "Mercedes"};

    public void carName() {
        System.out.println("Total Cars = " + carBrands.length);
        for (int brand = 0; brand < carBrands.length; brand++) {
            System.out.println("Car Brand = " + carBrands[brand]);
        }
    }
}
