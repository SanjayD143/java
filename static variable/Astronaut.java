class Astronaut {
    public int astronautId;
    public String astronautName;
    public long missionId;
    public float experienceYears;
    public double salary;
    public char rankCode;
    public boolean onDuty;

    public Astronaut(int astronautId, String astronautName, long missionId, float experienceYears,
                     double salary, char rankCode, boolean onDuty) {

        System.out.println("first try=" + this.astronautId);
        System.out.println("first try=" + this.astronautName);
        System.out.println("first try=" + this.missionId);
        System.out.println("first try=" + this.experienceYears);
        System.out.println("first try=" + this.salary);
        System.out.println("first try=" + this.rankCode);
        System.out.println("first try=" + this.onDuty);

        this.astronautId = astronautId;
        this.astronautName = astronautName;
        this.missionId = missionId;
        this.experienceYears = experienceYears;
        this.salary = salary;
        this.rankCode = rankCode;
        this.onDuty = onDuty;

        System.out.println("second try=" + this.astronautId);
        System.out.println("second try=" + this.astronautName);
        System.out.println("second try=" + this.missionId);
        System.out.println("second try=" + this.experienceYears);
        System.out.println("second try=" + this.salary);
        System.out.println("second try=" + this.rankCode);
        System.out.println("second try=" + this.onDuty);
    }
}
