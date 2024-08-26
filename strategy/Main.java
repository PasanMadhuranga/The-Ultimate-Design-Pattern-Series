package strategy;

public class Main {
    public static void main(String[] args) {
        ImageStorage image_storage = new ImageStorage();
        image_storage.store("pwwq", new JpegCompressor(), new HighContrastFilter());
        image_storage.store("htghs", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
