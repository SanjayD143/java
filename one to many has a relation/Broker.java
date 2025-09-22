class Broker {
    public int fee;
    public StockMarket stockMarket;

    public Broker(int fee, StockMarket stockMarket) {
        this.fee = fee;
        this.stockMarket = stockMarket;
    }

    public void displayDetails() {
        System.out.println("Broker service fee == " + fee);
        System.out.println("Stock Market Founder == " + stockMarket.founder);
    }
}