class CarRunner {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.displayCarName("Ferrari");
        sc.displayCarPrice(500000);
        sc.displayCarId(123456L);
        sc.displayCarMileage(15.5f);
        sc.displayCarEngine(3.8d);
        sc.displayCarGrade('A');
        sc.displayCarIsElectric(false);
    }
}
