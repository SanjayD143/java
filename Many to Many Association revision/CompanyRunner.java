class CompanyRunner {
    public static void main(String[] args) {
        // Create Companies
        Company google = new Company("Google");
        Company microsoft = new Company("Microsoft");

        // Create Employees
        Employee alice = new Employee("Alice Johnson", google);
        Employee bob = new Employee("Bob Smith", google);
        Employee charlie = new Employee("Charlie Brown", microsoft);
        Employee diana = new Employee("Diana Lee", microsoft);

        // Create Managers
        Manager mrClark = new Manager("Mr. Clark", google);
        Manager msAdams = new Manager("Ms. Adams", google);
        Manager mrPatel = new Manager("Mr. Patel", microsoft);
        Manager msSingh = new Manager("Ms. Singh", microsoft);

        // Create Projects
        Project searchProject = new Project("Search Engine", mrClark, alice);
        Project adsProject = new Project("Ads Platform", msAdams, bob);
        Project cloudProject = new Project("Cloud Services", mrPatel, charlie);
        Project officeProject = new Project("Office Suite", msSingh, diana);

        // Create Departments
        Department deptA = new Department("R&D Department", alice, mrClark, searchProject);
        Department deptB = new Department("Marketing Department", bob, msAdams, adsProject);
        Department deptC = new Department("Cloud Department", charlie, mrPatel, cloudProject);
        Department deptD = new Department("Productivity Department", diana, msSingh, officeProject);

        // Display Details
        alice.displayDetails();
        bob.displayDetails();
        charlie.displayDetails();
        diana.displayDetails();

        mrClark.displayDetails();
        msAdams.displayDetails();
        mrPatel.displayDetails();
        msSingh.displayDetails();

        searchProject.displayDetails();
        adsProject.displayDetails();
        cloudProject.displayDetails();
        officeProject.displayDetails();

        deptA.displayDetails();
        deptB.displayDetails();
        deptC.displayDetails();
        deptD.displayDetails();
    }
}