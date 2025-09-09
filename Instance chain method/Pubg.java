class Pubg {
    public int price;

    public void amount() {
        this.playerName("pavan");
        System.out.println("this is amount method");
    }

    public void playerName(String name) {
        this.playerID("maga", 1245123);
        System.out.println("this is playerName method with argument: " + name);
    }

    public void playerID(String name, int playerID) {
        System.out.println("this is playerID method with arguments: " + name + ", " + playerID);
    }
}
