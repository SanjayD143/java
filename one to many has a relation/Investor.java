class Investor {
    public int investment;
    public StockMarket stockMarket;

    public Investor(int investment, StockMarket stockMarket) {
        this.investment = investment;
        this.stockMarket = stockMarket;
    }

    public void displayDetails() {
        System.out.println("Investor capital == " + investment);
        System.out.println("Stock Market Founder == " + stockMarket.founder);
    }
}