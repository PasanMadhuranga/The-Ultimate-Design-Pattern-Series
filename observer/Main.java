package observer;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        SpreadSheet spread_sheet1 = new SpreadSheet();
        SpreadSheet spread_sheet2 = new SpreadSheet();
        Chart chart = new Chart();
        dataSource.addObserver(spread_sheet1);
        dataSource.addObserver(spread_sheet2);
        dataSource.addObserver(chart);
        dataSource.setValue(26);
    }
}
