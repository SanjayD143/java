class HospitalRunner {
    public static void main(String[] args) {

        long[] hospitalContactNumbers = Hospital.hospitalContactNumbers();
        for (int index = 0; index < hospitalContactNumbers.length; index++) {
            System.out.println("Hospital contact number: " + hospitalContactNumbers[index]);
        }

        String[] hospitalNames = Hospital.hospitalNames();
        for (int index = 0; index < hospitalNames.length; index++) {
            System.out.println("Hospital name: " + hospitalNames[index]);
        }

        char[] hospitalGrades = Hospital.hospitalGrades();
        for (int index = 0; index < hospitalGrades.length; index++) {
            System.out.println("Hospital grade: " + hospitalGrades[index]);
        }

        int[] hospitalCapacities = Hospital.hospitalCapacities();
        for (int index = 0; index < hospitalCapacities.length; index++) {
            System.out.println("Hospital capacity (beds): " + hospitalCapacities[index]);
        }

        double[] hospitalBills = Hospital.hospitalBills();
        for (int index = 0; index < hospitalBills.length; index++) {
            System.out.println("Hospital average bill: ₹" + hospitalBills[index]);
        }

        float[] hospitalRatings = Hospital.hospitalRatings();
        for (int index = 0; index < hospitalRatings.length; index++) {
            System.out.println("Hospital rating: " + hospitalRatings[index]);
        }

        boolean[] hospitalIsGovernment = Hospital.hospitalIsGovernment();
        for (int index = 0; index < hospitalIsGovernment.length; index++) {
            System.out.println("Hospital is government: " + hospitalIsGovernment[index]);
        }
    }
}
