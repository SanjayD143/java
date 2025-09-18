class TeacherRunner {
    public static void main(String[] args) {
        Student student = new Student("Arjun", "A");
        Teacher teacher = new Teacher("Prakash", "Maths", student);
        teacher.displayTeacher();
    }
}
