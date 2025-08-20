class EmployeeRunner {
    public static void main(String[] args) {

        long[] employeePhoneNumbers = Employee.employeePhoneNumbers();
        for (int index = 0; index < employeePhoneNumbers.length; index++) {
            System.out.println("Employee phone number: " + employeePhoneNumbers[index]);
        }

        String[] employeeNames = Employee.employeeNames();
        for (int index = 0; index < employeeNames.length; index++) {
            System.out.println("Employee name: " + employeeNames[index]);
        }

        char[] employeeGrades = Employee.employeeGrades();
        for (int index = 0; index < employeeGrades.length; index++) {
            System.out.println("Employee grade: " + employeeGrades[index]);
        }

        int[] employeeSalaries = Employee.employeeSalaries();
        for (int index = 0; index < employeeSalaries.length; index++) {
            System.out.println("Employee salary: " + employeeSalaries[index]);
        }

        double[] employeeExperienceInYears = Employee.employeeExperienceInYears();
        for (int index = 0; index < employeeExperienceInYears.length; index++) {
            System.out.println("Employee experience in years: " + employeeExperienceInYears[index]);
        }

        float[] employeeBonuses = Employee.employeeBonuses();
        for (int index = 0; index < employeeBonuses.length; index++) {
            System.out.println("Employee bonus: " + employeeBonuses[index]);
        }

        boolean[] employeeIsActive = Employee.employeeIsActive();
        for (int index = 0; index < employeeIsActive.length; index++) {
            System.out.println("Employee active status: " + employeeIsActive[index]);
        }
    }
}
