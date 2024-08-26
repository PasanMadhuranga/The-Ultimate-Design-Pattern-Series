package iterator;

public class Main {
    public static void main(String[] args) {
        BrowseHistory history = new BrowseHistory();

        history.push("A775D");
        history.push("&2727^Tv");
        history.push("HJu7(g4");
        history.push("un383939uj");

        Iterator iterator = history.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
