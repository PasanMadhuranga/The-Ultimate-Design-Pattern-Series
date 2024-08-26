package observer.exercise;

public class StockListView implements Observer{
    private Stocks stocks;

    public StockListView(Stocks stocks) {
        this.stocks = stocks;
    }

    @Override
    public void update() {
        System.out.println("Stock List view got updated");
        System.out.println(stocks.getStocks());
    }
}
