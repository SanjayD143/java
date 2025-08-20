class CompanyRunner {
    public static void main(String[] args) {

        long[] companyContactNumbers = Company.companyContactNumbers();
        for (int index = 0; index < companyContactNumbers.length; index++) {
            System.out.println("Company contact number: " + companyContactNumbers[index]);
        }

        String[] companyEmployeeNames = Company.companyEmployeeNames();
        for (int index = 0; index < companyEmployeeNames.length; index++) {
            System.out.println("Company employee name: " + companyEmployeeNames[index]);
        }

        char[] companyGrades = Company.companyGrades();
        for (int index = 0; index < companyGrades.length; index++) {
            System.out.println("Company grade: " + companyGrades[index]);
        }

        int[] companyEmployeeCounts = Company.companyEmployeeCounts();
        for (int index = 0; index < companyEmployeeCounts.length; index++) {
            System.out.println("Company employee count: " + companyEmployeeCounts[index]);
        }

        double[] companyRevenues = Company.companyRevenues();
        for (int index = 0; index < companyRevenues.length; index++) {
            System.out.println("Company revenue: ₹" + companyRevenues[index]);
        }

        float[] companyRatings = Company.companyRatings();
        for (int index = 0; index < companyRatings.length; index++) {
            System.out.println("Company rating: " + companyRatings[index]);
        }

        boolean[] companyIsMNC = Company.companyIsMNC();
        for (int index = 0; index < companyIsMNC.length; index++) {
            System.out.println("Company is MNC: " + companyIsMNC[index]);
        }
    }
}
