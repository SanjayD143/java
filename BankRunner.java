class BankRunner {
    public static void main(String[] args) {

        long[] bankAccountNumbers = Bank.bankAccountNumbers();
        for (int index = 0; index < bankAccountNumbers.length; index++) {
            System.out.println("Bank account number: " + bankAccountNumbers[index]);
        }

        String[] bankBranchNames = Bank.bankBranchNames();
        for (int index = 0; index < bankBranchNames.length; index++) {
            System.out.println("Bank branch name: " + bankBranchNames[index]);
        }

        char[] bankGrades = Bank.bankGrades();
        for (int index = 0; index < bankGrades.length; index++) {
            System.out.println("Bank grade: " + bankGrades[index]);
        }

        int[] bankEmployeeCounts = Bank.bankEmployeeCounts();
        for (int index = 0; index < bankEmployeeCounts.length; index++) {
            System.out.println("Bank employee count: " + bankEmployeeCounts[index]);
        }

        double[] bankInterestRates = Bank.bankInterestRates();
        for (int index = 0; index < bankInterestRates.length; index++) {
            System.out.println("Bank interest rate: " + bankInterestRates[index] + "%");
        }

        float[] bankRatings = Bank.bankRatings();
        for (int index = 0; index < bankRatings.length; index++) {
            System.out.println("Bank rating: " + bankRatings[index]);
        }

        boolean[] bankIsNationalised = Bank.bankIsNationalised();
        for (int index = 0; index < bankIsNationalised.length; index++) {
            System.out.println("Bank is nationalised: " + bankIsNationalised[index]);
        }
    }
}
