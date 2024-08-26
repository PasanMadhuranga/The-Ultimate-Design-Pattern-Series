package observer.exercise;

public class Main {
    public static void main(String[] args) {
        Stocks stocks = new Stocks();
        StatusBar statusBar = new StatusBar(stocks);
        StockListView stockListView = new StockListView(stocks);

        stocks.addObserver(statusBar);
        stocks.addObserver(stockListView);

        stocks.addStock("Bitcoin", 43563.35);
        stocks.addStock("Etherium", 2656.34);
        stocks.addStock("Light Coin", 1693.47);
        stocks.addStock("Dodge Coin", 669.83);

        stocks.removeStock("Etherium");

        stocks.changeStockPrice("Light Coin", 1200.26);
    }
}
