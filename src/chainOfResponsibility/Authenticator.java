package chainOfResponsibility;

public class Authenticator extends Handler {

	
	public Authenticator(Handler next) {
		super(next);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean doHandle(HttpRequest request) {
		// TODO Auto-generated method stub
		boolean isvalidUser = (request.getUserName() == "Admin" && request.getPassword() == "12345");
		System.out.println("Authenticate");
		return !isvalidUser;
		
	}
	
	
}
