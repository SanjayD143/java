class SchoolRunner {
    public static void main(String[] args) {
        // Create Schools
        School greenwood = new School("Greenwood High");
        School techAcademy = new School("Tech Academy");

        // Create Students
        Student alice = new Student("Alice", greenwood);
        Student bob = new Student("Bob", greenwood);
        Student charlie = new Student("Charlie", techAcademy);
        Student diana = new Student("Diana", techAcademy);

        // Create Teachers
        Teacher mrSmith = new Teacher("Mr. Smith", greenwood);
        Teacher msJones = new Teacher("Ms. Jones", greenwood);
        Teacher mrBrown = new Teacher("Mr. Brown", techAcademy);
        Teacher msWhite = new Teacher("Ms. White", techAcademy);

        // Create Subjects
        Subject math = new Subject("Mathematics", mrSmith, alice);
        Subject science = new Subject("Science", msJones, bob);
        Subject programming = new Subject("Programming", mrBrown, charlie);
        Subject english = new Subject("English", msWhite, diana);

        // Display Details
        alice.displayDetails();
        bob.displayDetails();
        charlie.displayDetails();
        diana.displayDetails();

        mrSmith.displayDetails();
        msJones.displayDetails();
        mrBrown.displayDetails();
        msWhite.displayDetails();

        math.displayDetails();
        science.displayDetails();
        programming.displayDetails();
        english.displayDetails();
    }
}