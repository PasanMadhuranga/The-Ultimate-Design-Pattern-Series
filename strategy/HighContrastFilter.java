package strategy;

public class HighContrastFilter implements Filter{

    @Override
    public void apply(String file_name) {
        System.out.println("Applying High Contrast Filter.");
    }
}
