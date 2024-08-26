package proxy;

public class Main {
    public static void main(String[] args) {
        Library ebooks_library = new Library();
        String[] file_names = {"A", "B", "C"};
        for (String file_name: file_names){
            ebooks_library.add(new EbookProxy(file_name));
        }

        ebooks_library.openEbook("A");
    }
}
