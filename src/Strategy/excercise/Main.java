package Strategy.excercise;

public class Main {
    public static void main(String[] args) {
        ChatClient c = new ChatClient();
        c.send();
        c.setMyencryption(new AESEncrypt());
        c.send();
    }
}
