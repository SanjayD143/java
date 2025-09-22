class Exchange {
    public int volume;
    public StockMarket stockMarket;

    public Exchange(int volume, StockMarket stockMarket) {
        this.volume = volume;
        this.stockMarket = stockMarket;
    }

    public void displayDetails() {
        System.out.println("Exchange daily volume == " + volume);
        System.out.println("Stock Market Founder == " + stockMarket.founder);
    }
}