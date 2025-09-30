
class Teacher {
    public String teacherName;
    public School school;

    public Teacher(String teacherName, School school) {
        this.teacherName = teacherName;
        this.school = school;
    }

    public void displayDetails() {
        System.out.println("Teacher Name == " + teacherName);
        System.out.println("School == " + school.schoolName);
    }
}