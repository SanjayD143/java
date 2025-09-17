class SchoolRunner {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Kumar");
        School school = new School(teacher);
        school.displaySchool();
    }
}
