class School {
    public int schoolStudents;
    public String schoolTeacher;

    public School(int schoolStudents, String schoolTeacher) {
        this.schoolStudents = schoolStudents;
        this.schoolTeacher = schoolTeacher;
    }

    public void schoolDetails() {
        System.out.println("School has " + schoolStudents + " students, Teacher: " + schoolTeacher);
    }
}



