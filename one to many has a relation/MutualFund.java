class MutualFund {
    public int fundValue;
    public StockMarket stockMarket;

    public MutualFund(int fundValue, StockMarket stockMarket) {
        this.fundValue = fundValue;
        this.stockMarket = stockMarket;
    }

    public void displayDetails() {
        System.out.println("Mutual Fund value == " + fundValue);
        System.out.println("Stock Market Founder == " + stockMarket.founder);
    }
}
