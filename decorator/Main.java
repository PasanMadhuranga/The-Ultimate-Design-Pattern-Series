package decorator;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(new CloudStream(), "1234-5678-1234-6789");
        storeCreditCard(new EncryptedCloudStream(new CloudStream()), "1234-5678-1234-6789");
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())), "1234-5678-1234-6789");
    }

    public static void storeCreditCard(Stream stream, String credit_card_num){
        stream.write(credit_card_num);
    }
}
