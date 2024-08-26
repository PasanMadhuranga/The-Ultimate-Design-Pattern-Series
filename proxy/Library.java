package proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    Map<String, Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook){
        ebooks.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String fileName){
        if (ebooks.containsKey(fileName)){
            ebooks.get(fileName).show();
        }else {
            System.out.println("Ebook not found");
        }
    }
}
