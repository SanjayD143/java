class Bank {
    public static long[] bankAccountNumbers() {
        long[] bankAccountNumbers = {12345678901L, 98765432109L, 11223344556L, 99887766554L};
        System.out.println("Bank account numbers");
        return bankAccountNumbers;
    }

    public static String[] bankBranchNames() {
        String[] bankBranchNames = {"MG Road Branch", "BTM Layout Branch", "Indiranagar Branch", "Whitefield Branch"};
        return bankBranchNames;
    }

    public static char[] bankGrades() {
        char[] bankGrades = {'A', 'B', 'A', 'C'};
        return bankGrades;
    }

    public static int[] bankEmployeeCounts() {
        int[] bankEmployeeCounts = {120, 95, 200, 150};
        return bankEmployeeCounts;
    }

    public static double[] bankInterestRates() {
        double[] bankInterestRates = {6.5, 7.0, 5.9, 6.75};
        return bankInterestRates;
    }

    public static float[] bankRatings() {
        float[] bankRatings = {4.5f, 3.9f, 4.2f, 4.7f};
        return bankRatings;
    }

    public static boolean[] bankIsNationalised() {
        boolean[] bankIsNationalised = {true, false, true, false};
        return bankIsNationalised;
    }
}
