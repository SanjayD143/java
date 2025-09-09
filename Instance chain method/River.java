class River {
    public void riverName(String name) {
        this.riverID("Ganga", 901);
        System.out.println("this is argument cons " + name);
    }
    public void riverID(String name, int id) {
        this.riverLength("Yamuna", 1001, 'A');
        System.out.println("this is double argument cons " + name + "," + id);
    }
    public void riverLength(String name, int id, char typeCode) {
        this.riverDepth("Amazon", 1101, 'B', 3000);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + typeCode);
    }
    public void riverDepth(String name, int id, char typeCode, int depth) {
        this.riverFlow("Nile", 1201, 'C', 5000, 150.5f);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + typeCode + "," + depth);
    }
    public void riverFlow(String name, int id, char typeCode, int depth, float flowSpeed) {
        this.riverPollution("Mississippi", 1301, 'D', 7000, 200.2f, 75.5);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + typeCode + "," + depth + "," + flowSpeed);
    }
    public void riverPollution(String name, int id, char typeCode, int depth, float flowSpeed, double pollutionIndex) {
        System.out.println("this is multiple argument cons " + name + "," + id + "," + typeCode + "," + depth + "," + flowSpeed + "," + pollutionIndex);
    }
}
class RiverRunner {
    public static void main(String[] args) {
        River river = new River();
        river.riverName("Thames");
    }
}
