class StockMarketRunner {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket("Rakesh Jhunjhunwala");

        Broker broker = new Broker(500, stockMarket);
        Exchange exchange = new Exchange(1000000, stockMarket);
        Investor investor = new Investor(200000, stockMarket);
        MutualFund mutualFund = new MutualFund(150000, stockMarket);
        Derivative derivative = new Derivative(75000, stockMarket);

        broker.displayDetails();
        exchange.displayDetails();
        investor.displayDetails();
        mutualFund.displayDetails();
        derivative.displayDetails();
    }
}