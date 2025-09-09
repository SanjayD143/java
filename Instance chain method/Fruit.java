class Fruit {
    public void fruitName(String name) {
        this.fruitID("Apple", 201);
        System.out.println("this is argument cons " + name);
    }

    public void fruitID(String name, int id) {
        this.fruitColor("Banana", 301, 'Y');
        System.out.println("this is double argument cons " + name + "," + id);
    }

    public void fruitColor(String name, int id, char colorCode) {
        this.fruitPrice("Orange", 401, 'O', 120L);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + colorCode);
    }

    public void fruitPrice(String name, int id, char colorCode, long price) {
        this.fruitWeight("Grapes", 501, 'G', 150L, 1.2f);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + colorCode + "," + price);
    }

    public void fruitWeight(String name, int id, char colorCode, long price, float weight) {
        this.fruitTaste("Pineapple", 601, 'P', 250L, 2.5f, 8.9);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + colorCode + "," + price + "," + weight);
    }

    public void fruitTaste(String name, int id, char colorCode, long price, float weight, double sweetness) {
        System.out.println("this is multiple argument cons " + name + "," + id + "," + colorCode + "," + price + "," + weight + "," + sweetness);
    }
}
