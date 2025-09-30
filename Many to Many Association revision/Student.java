class Student {
    public String studentName;
    public School school;

    public Student(String studentName, School school) {
        this.studentName = studentName;
        this.school = school;
    }

    public void displayDetails() {
        System.out.println("Student Name == " + studentName);
        System.out.println("School == " + school.schoolName);
    }
}