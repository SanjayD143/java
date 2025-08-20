class CollegeRunner {
    public static void main(String[] args) {

        long[] collegeContactNumbers = College.collegeContactNumbers();
        for (int index = 0; index < collegeContactNumbers.length; index++) {
            System.out.println("College contact number: " + collegeContactNumbers[index]);
        }

        String[] collegeStudentNames = College.collegeStudentNames();
        for (int index = 0; index < collegeStudentNames.length; index++) {
            System.out.println("College student name: " + collegeStudentNames[index]);
        }

        char[] collegeGrades = College.collegeGrades();
        for (int index = 0; index < collegeGrades.length; index++) {
            System.out.println("College grade: " + collegeGrades[index]);
        }

        int[] collegeStudentCounts = College.collegeStudentCounts();
        for (int index = 0; index < collegeStudentCounts.length; index++) {
            System.out.println("College student count: " + collegeStudentCounts[index]);
        }

        double[] collegeFees = College.collegeFees();
        for (int index = 0; index < collegeFees.length; index++) {
            System.out.println("College fee: ₹" + collegeFees[index]);
        }

        float[] collegeRatings = College.collegeRatings();
        for (int index = 0; index < collegeRatings.length; index++) {
            System.out.println("College rating: " + collegeRatings[index]);
        }

        boolean[] collegeIsGovernment = College.collegeIsGovernment();
        for (int index = 0; index < collegeIsGovernment.length; index++) {
            System.out.println("College is Government: " + collegeIsGovernment[index]);
        }
    }
}
