package observer.exercise;

import java.util.Hashtable;

public class Stocks extends Subject{
    private Hashtable<String, Double> stocks = new Hashtable<>();

    public void addStock(String stock, double price){
        stocks.put(stock, price);
        notifyObservers();
    }

    public void removeStock(String stock){
        stocks.remove(stock);
        notifyObservers();
    }

    public void changeStockPrice(String stock, double price) {
        stocks.remove(stock);
        stocks.put(stock, price);
        notifyObservers();
    }

    public Hashtable<String, Double> getStocks() {
        return stocks;
    }


}
