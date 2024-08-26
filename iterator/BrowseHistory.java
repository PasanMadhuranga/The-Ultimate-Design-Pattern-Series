package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public  void push(String url){
        urls.add(url);
    }

    public String pop(){
        int last_index = urls.size() - 1;
        String last_url = urls.get(last_index);
        urls.remove(last_index);
        return last_url;
    }

    public Iterator createIterator(){
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator{
        private BrowseHistory history;
        private int index = 0;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }
        @Override
        public boolean hasNext(){
            return index < history.urls.size();
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}


//// In the following code we change the ArrayList to String array.
//// But we didn't want to change anything in the Main class.
//
//package iterator;
//
//public class BrowseHistory {
//    private String[] urls = new String[10];
//    private int count = 0;
//
//    public  void push(String url){
//        urls[count++] = url;
//    }
//
//    public String pop(){
//        return urls[--count];
//    }
//
//
//    public Iterator createIterator(){
//        return new ArrayIterator(this);
//    }
//
//    public class ArrayIterator implements Iterator{
//        private BrowseHistory history;
//        private int index = 0;
//
//        public ArrayIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext(){
//            return index < history.count;
//        }
//
//        @Override
//        public String current() {
//            return history.urls[index];
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }
//}
