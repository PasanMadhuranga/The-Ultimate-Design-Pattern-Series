package strategy;

public class ImageStorage {
    public void store(String file_name, Compressor compressor, Filter filter){
        compressor.compress(file_name);
        filter.apply(file_name);
    }
}
