class College {
    public int collegeStudents;
    public String collegeFacultsNames;

    // Constructor
    public College(int collegeStudents, String collegeFacultsNames) {
        this.collegeStudents = collegeStudents;   // use the passed values
        this.collegeFacultsNames = collegeFacultsNames;
    }

    // Method to display college details
    public void collegeDetails() {
        System.out.println("College has " + collegeStudents + " students, Faculty: " + collegeFacultsNames);
    }
}