package strategy;

public class PngCompressor implements Compressor{
    @Override
    public void compress(String file_name) {
        System.out.println("Compressing the image using PNG");
    }
}
