class Road {
    public void roadName(String name) {
        this.roadID("Highway", 101);
        System.out.println("this is argument cons " + name);
    }

    public void roadID(String name, int id) {
        this.roadLength(200, "National", 'A');
        System.out.println("this is double argument cons " + name + "," + id);
    }

    public void roadLength(int km, String type, char grade) {
        this.roadToll(200, "Express", 'B', 500000L);
        System.out.println("this is multiple argument cons " + km + "," + type + "," + grade);
    }

    public void roadToll(int km, String type, char grade, long cost) {
        this.roadSafety(200, "Express", 'C', 500000L, 22.5f);
        System.out.println("this is multiple argument cons " + km + "," + type + "," + grade + "," + cost);
    }

    public void roadSafety(int km, String type, char grade, long cost, float width) {
        this.roadTraffic(200, "Express", 'D', 500000L, 22.5f, 98.76);
        System.out.println("this is multiple argument cons " + km + "," + type + "," + grade + "," + cost + "," + width);
    }

    public void roadTraffic(int km, String type, char grade, long cost, float width, double trafficIndex) {
        System.out.println("this is multiple argument cons " + km + "," + type + "," + grade + "," + cost + "," + width + "," + trafficIndex);
    }
}
