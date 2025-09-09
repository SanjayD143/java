class BulbRunner {
    public static void main(String[] args) {
        int price = 200;
        System.out.println("This is re-initialize price: " + price);

        Bulb bulb = new Bulb();
        bulb.price = price; 
        bulb.noOfBulb();
    }
}
