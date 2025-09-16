class Student {
    public void studentDetails(College[] colleges) {
        for (College college : colleges) {
            college.collegeDetails();
        }
    }
}