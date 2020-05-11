package Strategy.excercise;

public class ChatClient {
    EncryptAlgoritham myencryption;

    public ChatClient() {
        this.myencryption = new DESEncrypt();
    }

    public void setMyencryption(EncryptAlgoritham myencryption) {
        this.myencryption = myencryption;
    }

    public void send() {
        System.out.println("sending message : " + myencryption.encrypt());
    }
}
