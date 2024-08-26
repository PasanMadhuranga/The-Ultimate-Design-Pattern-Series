package strategy;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String file_name) {
        System.out.println("Compressing the image using JPEG");
    }
}
