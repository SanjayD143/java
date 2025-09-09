class Festival {
    public void festivalName(String name) {
        this.festivalID("Diwali", 1001);
        System.out.println("this is argument cons " + name);
    }
    public void festivalID(String name, int id) {
        this.festivalType("Holi", 1101, 'A');
        System.out.println("this is double argument cons " + name + "," + id);
    }
    public void festivalType(String name, int id, char category) {
        this.festivalDuration("Christmas", 1201, 'B', 5);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + category);
    }
    public void festivalDuration(String name, int id, char category, int days) {
        this.festivalCelebration("Eid", 1301, 'C', 3, 10000L);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + category + "," + days);
    }
    public void festivalCelebration(String name, int id, char category, int days, long people) {
        this.festivalCost("Thanksgiving", 1401, 'D', 2, 5000L, 1000000.5);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + category + "," + days + "," + people);
    }
    public void festivalCost(String name, int id, char category, int days, long people, double cost) {
        System.out.println("this is multiple argument cons " + name + "," + id + "," + category + "," + days + "," + people + "," + cost);
    }
}

