package adapter;

import adapter.avaFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.applyFilter(new VividFilter());
        imageView.applyFilter(new CaramelFilter(new Caramel()));
    }
}
