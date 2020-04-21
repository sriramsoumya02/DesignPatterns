package facade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationService service= new NotificationService();
		service.send("Hello world", "m target");
	}

}
