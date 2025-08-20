class UniversityRunner {
    public static void main(String[] args) {

        long[] universityContactNumbers = University.universityContactNumbers();
        for (int index = 0; index < universityContactNumbers.length; index++) {
            System.out.println("University contact number: " + universityContactNumbers[index]);
        }

        String[] universityCourseNames = University.universityCourseNames();
        for (int index = 0; index < universityCourseNames.length; index++) {
            System.out.println("University course name: " + universityCourseNames[index]);
        }

        char[] universityGrades = University.universityGrades();
        for (int index = 0; index < universityGrades.length; index++) {
            System.out.println("University grade: " + universityGrades[index]);
        }

        int[] universityStudentCounts = University.universityStudentCounts();
        for (int index = 0; index < universityStudentCounts.length; index++) {
            System.out.println("University student count: " + universityStudentCounts[index]);
        }

        double[] universityFees = University.universityFees();
        for (int index = 0; index < universityFees.length; index++) {
            System.out.println("University fee: ₹" + universityFees[index]);
        }

        float[] universityRatings = University.universityRatings();
        for (int index = 0; index < universityRatings.length; index++) {
            System.out.println("University rating: " + universityRatings[index]);
        }

        boolean[] universityIsGovernment = University.universityIsGovernment();
        for (int index = 0; index < universityIsGovernment.length; index++) {
            System.out.println("University is Government: " + universityIsGovernment[index]);
        }
    }
}
