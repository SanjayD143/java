class Subject {
    public String subjectName;
    public Teacher teacher;
    public Student student;

    public Subject(String subjectName, Teacher teacher, Student student) {
        this.subjectName = subjectName;
        this.teacher = teacher;
        this.student = student;
    }

    public void displayDetails() {
        System.out.println("Subject Name == " + subjectName);
        System.out.println("Teacher == " + teacher.teacherName);
        System.out.println("Student == " + student.studentName);
        System.out.println("School == " + student.school.schoolName);
    }
}