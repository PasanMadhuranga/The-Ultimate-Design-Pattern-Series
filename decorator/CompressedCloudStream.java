package decorator;

public class CompressedCloudStream implements Stream{
    Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }
    @Override
    public void write(String data) {
        System.out.println(data + " is compressed as 'ccccc'.");
        stream.write("ccccc");
    }
}
