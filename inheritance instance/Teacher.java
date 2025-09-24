class Teacher extends Student {
    public static void assignRollNo() {
        rollNo = 101;
        System.out.println("This is roll number: " + rollNo);
    }

    public void displayStudent() {
        studentName = "Rahul";
        System.out.println("This is student name: " + studentName);
    }
}