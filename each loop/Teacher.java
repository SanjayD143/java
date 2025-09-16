class Teacher {
    public void teacherDetails(School[] schools) {
        for (School school : schools) {
            school.schoolDetails();
        }
    }
}