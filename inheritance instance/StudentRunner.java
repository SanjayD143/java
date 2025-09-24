class StudentRunner {
    public static void main(String[] args) {
        Teacher.assignRollNo();
        Teacher t = new Teacher();
        t.displayStudent();
    }
}