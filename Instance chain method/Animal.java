class Animal {
    public void animalName(String name) {
        this.animalID("Tiger", 501);
        System.out.println("this is argument cons " + name);
    }
    public void animalID(String name, int id) {
        this.animalType("Lion", 601, 'A');
        System.out.println("this is double argument cons " + name + "," + id);
    }
    public void animalType(String name, int id, char category) {
        this.animalWeight("Elephant", 701, 'B', 5000L);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + category);
    }
    public void animalWeight(String name, int id, char category, long weight) {
        this.animalSpeed("Cheetah", 801, 'C', 70L, 120.5f);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + category + "," + weight);
    }
    public void animalSpeed(String name, int id, char category, long weight, float speed) {
        this.animalLife("Parrot", 901, 'D', 1L, 0.3f, 80.5);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + category + "," + weight + "," + speed);
    }
    public void animalLife(String name, int id, char category, long weight, float speed, double lifeSpan) {
        System.out.println("this is multiple argument cons " + name + "," + id + "," + category + "," + weight + "," + speed + "," + lifeSpan);
    }
}
class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animalName("Dog");
    }
}
