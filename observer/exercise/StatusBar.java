package observer.exercise;

public class StatusBar implements Observer{
    private Stocks stocks;

    public StatusBar(Stocks stocks) {
        this.stocks = stocks;
    }

    @Override
    public void update() {
        System.out.println("Status Bar got updated");
        System.out.println("Bitcoin: " + stocks.getStocks().get("Bitcoin"));
    }
}
