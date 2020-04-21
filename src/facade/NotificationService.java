package facade;

public class NotificationService {
	
	
	public void send(String msg,String target) {
		NotificationServer server= new NotificationServer();
		Connection connection= server.connect("my idappdress");
		AuthToken token=server.authenticate("appid", "key");
		server.send(token,new Message(msg), target);
		connection.disconnect();
	}

}
