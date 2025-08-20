class Car {
    public static long[] carRegistrationNumbers() {
        long[] carRegistrationNumbers = {9876543210L, 8765432109L, 7654321098L, 6543210987L};
        System.out.println("Car registration numbers");
        return carRegistrationNumbers;
    }

    public static String[] carBrands() {
        String[] carBrands = {"Toyota", "BMW", "Mercedes", "Tata"};
        return carBrands;
    }

    public static char[] carGrades() {
        char[] carGrades = {'A', 'B', 'C', 'D'};
        return carGrades;
    }

    public static int[] carEngineCapacities() {
        int[] carEngineCapacities = {1200, 1500, 1800, 2000};
        return carEngineCapacities;
    }

    public static double[] carPrices() {
        double[] carPrices = {550000.75, 1200000.50, 2500000.00, 800000.25};
        return carPrices;
    }

    public static float[] carMileage() {
        float[] carMileage = {15.5f, 18.0f, 12.8f, 20.2f};
        return carMileage;
    }

    public static boolean[] carIsAutomatic() {
        boolean[] carIsAutomatic = {true, false, true, false};
        return carIsAutomatic;
    }
}
