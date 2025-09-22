
class Derivative {
    public int contractValue;
    public StockMarket stockMarket;

    public Derivative(int contractValue, StockMarket stockMarket) {
        this.contractValue = contractValue;
        this.stockMarket = stockMarket;
    }

    public void displayDetails() {
        System.out.println("Derivative contract value == " + contractValue);
        System.out.println("Stock Market Founder == " + stockMarket.founder);
    }
}