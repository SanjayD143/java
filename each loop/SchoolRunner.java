class SchoolRunner {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        School school1 = new School(500, "Ramesh");
        School school2 = new School(600, "Anitha");

        School[] schools = {school1, school2};
        teacher.teacherDetails(schools);
    }
}
