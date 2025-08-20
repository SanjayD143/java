class LaptopRunner {
    public static void main(String[] args) {
        
        long[] laptopSerialNumbers = Laptop.laptopSerialNumbers();
        for (int index = 0; index < laptopSerialNumbers.length; index++) {
            System.out.println("Laptop serial number: " + laptopSerialNumbers[index]);
        }

        String[] laptopBrands = Laptop.laptopBrands();
        for (int index = 0; index < laptopBrands.length; index++) {
            System.out.println("Laptop brand: " + laptopBrands[index]);
        }

        char[] laptopGrades = Laptop.laptopGrades();
        for (int index = 0; index < laptopGrades.length; index++) {
            System.out.println("Laptop grade: " + laptopGrades[index]);
        }

        int[] laptopRamSizes = Laptop.laptopRamSizes();
        for (int index = 0; index < laptopRamSizes.length; index++) {
            System.out.println("Laptop RAM size: " + laptopRamSizes[index] + " GB");
        }

        double[] laptopPrices = Laptop.laptopPrices();
        for (int index = 0; index < laptopPrices.length; index++) {
            System.out.println("Laptop price: ₹" + laptopPrices[index]);
        }

        float[] laptopVersions = Laptop.laptopVersions();
        for (int index = 0; index < laptopVersions.length; index++) {
            System.out.println("Laptop version: " + laptopVersions[index]);
        }

        boolean[] laptopIsWorking = Laptop.laptopIsWorking();
        for (int index = 0; index < laptopIsWorking.length; index++) {
            System.out.println("Laptop condition working: " + laptopIsWorking[index]);
        }
    }
}
