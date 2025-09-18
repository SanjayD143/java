class Teacher {
    public String teacherName;
    public String subject;
    public Student student;

    public Teacher(String teacherName, String subject, Student student) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.student = student;
    }

    public void displayTeacher() {
        System.out.println("Teacher: " + teacherName +", Subject: " + subject +", Student: " + student.studentName +", Grade: " + student.grade);
    }
}
