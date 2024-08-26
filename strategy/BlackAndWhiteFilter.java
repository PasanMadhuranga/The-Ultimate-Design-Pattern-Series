package strategy;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String file_name) {
        System.out.println("Applying Black & White Filter.");
    }
}
