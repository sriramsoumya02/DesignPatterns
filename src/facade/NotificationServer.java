package facade;

public class NotificationServer {
	//connect()-->Connection
	//Authenticate(AppId,Key)-->AuthToken
	//send(AuthToken,message,Target)-->void
	//conn.disconnect
	
	public Connection connect(String ipaddress) {
		return new Connection();
	}
	
	public AuthToken authenticate(String appId,String key) {
		return new AuthToken();
		
	}
	
	public void send(AuthToken authToken,Message message,String Target) {
		System.out.println("Sending message:"+message.getContent());
	}
}
