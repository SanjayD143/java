class School {
    public String name;
    public Teacher teacher;

    public School(Teacher teacher) {
        this.name = teacher.name;
        this.teacher = teacher;
    }

    public void displaySchool() {
        teacher.displayTeacher();
    }
}
