package decorator;

public class EncryptedCloudStream implements Stream{
    Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        System.out.println(data + " is encrypted as '45RT^&&*()TRE#@#$'" );
        stream.write("45RT^&&*()TRE#@#$");
    }
}
