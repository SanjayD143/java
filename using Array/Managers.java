class Managers {

    public static void main(String[] args) {

        String firstManager = "Suresh";
        String secondManager = "Mahesh";
        String thirdManager = "Naresh";
        String fourthManager = "Ganesh";

        System.out.println("Manager list of Names");
        System.out.println("---------------------------");

        String[] managerNames = { firstManager, secondManager, thirdManager, fourthManager };

        for (int i = 0; i < managerNames.length; i++) {
            System.out.println(managerNames[i]);
        }

        int sureshId = 201;
        int maheshId = 202;
        int nareshId = 203;
        int ganeshId = 204;

        System.out.println("Manager list of ID");
        System.out.println("---------------------------");

        int[] managerIds = { sureshId, maheshId, nareshId, ganeshId };

        for (int id = 0; id < managerIds.length; id++) {
            System.out.println(managerIds[id]);
        }

        long sureshNumber = 9988776655L;
        long maheshNumber = 8877665544L;
        long nareshNumber = 7766554433L;
        long ganeshNumber = 6655443322L;

        System.out.println("Manager list of Number");
        System.out.println("---------------------------");

        long[] managerNumbers = { sureshNumber, maheshNumber, nareshNumber, ganeshNumber };

        for (int num = 0; num < managerNumbers.length; num++) {
            System.out.println(managerNumbers[num]);
        }

        float sureshHeight = 6.0f;
        float maheshHeight = 5.7f;
        float nareshHeight = 5.8f;
        float ganeshHeight = 5.9f;

        System.out.println("Manager list of Height");
        System.out.println("---------------------------");

        float[] managerHeights = { sureshHeight, maheshHeight, nareshHeight, ganeshHeight };

        for (int h = 0; h < managerHeights.length; h++) {
            System.out.println(managerHeights[h]);
        }

        double sureshExpenditure = 4000.50d;
        double maheshExpenditure = 4500.75d;
        double nareshExpenditure = 3800.25d;
        double ganeshExpenditure = 5000.00d;

        System.out.println("Manager list of Expenditure");
        System.out.println("---------------------------");

        double[] managerExpenditure = { sureshExpenditure, maheshExpenditure, nareshExpenditure, ganeshExpenditure };

        for (int e = 0; e < managerExpenditure.length; e++) {
            System.out.println(managerExpenditure[e]);
        }

        char sureshGrade = 'A';
        char maheshGrade = 'A';
        char nareshGrade = 'B';
        char ganeshGrade = 'A';

        System.out.println("Manager list of Grade");
        System.out.println("---------------------------");

        char[] managerGrades = { sureshGrade, maheshGrade, nareshGrade, ganeshGrade };

        for (int g = 0; g < managerGrades.length; g++) {
            System.out.println(managerGrades[g]);
        }

        boolean sureshIsManager = true;
        boolean maheshIsManager = true;
        boolean nareshIsManager = true;
        boolean ganeshIsManager = true;

        System.out.println("Manager list");
        System.out.println("---------------------------");

        boolean[] isManager = { sureshIsManager, maheshIsManager, nareshIsManager, ganeshIsManager };

        for (int j = 0; j < isManager.length; j++) {
            System.out.println(isManager[j]);
        }
    }
}
