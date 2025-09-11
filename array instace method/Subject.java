class Subject {
    public String[] subjects = {"Math", "Science", "History", "Computer Science"};

    public void subjectName() {
        System.out.println("Total Subjects = " + subjects.length);
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Subject = " + subjects[i]);
        }
    }
}