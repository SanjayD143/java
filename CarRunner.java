class CarRunner {
    public static void main(String[] args) {
        
        long[] carRegistrationNumbers = Car.carRegistrationNumbers();
        for (int index = 0; index < carRegistrationNumbers.length; index++) {
            System.out.println("Car registration number: " + carRegistrationNumbers[index]);
        }

        String[] carBrands = Car.carBrands();
        for (int index = 0; index < carBrands.length; index++) {
            System.out.println("Car brand: " + carBrands[index]);
        }

        char[] carGrades = Car.carGrades();
        for (int index = 0; index < carGrades.length; index++) {
            System.out.println("Car grade: " + carGrades[index]);
        }

        int[] carEngineCapacities = Car.carEngineCapacities();
        for (int index = 0; index < carEngineCapacities.length; index++) {
            System.out.println("Car engine capacity (cc): " + carEngineCapacities[index]);
        }

        double[] carPrices = Car.carPrices();
        for (int index = 0; index < carPrices.length; index++) {
            System.out.println("Car price: ₹" + carPrices[index]);
        }

        float[] carMileage = Car.carMileage();
        for (int index = 0; index < carMileage.length; index++) {
            System.out.println("Car mileage (km/l): " + carMileage[index]);
        }

        boolean[] carIsAutomatic = Car.carIsAutomatic();
        for (int index = 0; index < carIsAutomatic.length; index++) {
            System.out.println("Car is automatic: " + carIsAutomatic[index]);
        }
    }
}
