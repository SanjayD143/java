class CollegeRunner {
    public static void main(String[] args) {
        Student student = new Student();

        College college1 = new College(300, "Nisha");
        College college2 = new College(400, "Uppar");
        College college3 = new College(200, "Vijay Alva");
        College college4 = new College(350, "Baddi Baskar");
        College college5 = new College(250, "K E Prakash");

       
        College[] colleges = {college1, college2, college3, college4, college5};

       
       student.studentDetails(colleges);
    }
}