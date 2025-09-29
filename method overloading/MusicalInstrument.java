class MusicalInstrument {
    public void display(String name) {
        System.out.println("Instrument Name==" + name);
    }
    public void display(String name, String type) {
        System.out.println("Instrument Name==" + name);
        System.out.println("Type==" + type);
    }
    public void display(String name, String type, int yearMade) {
        System.out.println("Instrument Name==" + name);
        System.out.println("Type==" + type);
        System.out.println("Year Made==" + yearMade);
    }
    public void display(String name, String type, int yearMade, boolean isAcoustic) {
        System.out.println("Instrument Name==" + name);
        System.out.println("Type==" + type);
        System.out.println("Year Made==" + yearMade);
        System.out.println("Acoustic==" + isAcoustic);
    }
}


