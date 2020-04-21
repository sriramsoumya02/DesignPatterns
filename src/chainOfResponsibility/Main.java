package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpRequest request= new HttpRequest("Admin", "12345");
		Compressor com= new Compressor(null);
		Logger log= new Logger(com);
		Authenticator auth= new Authenticator(log);
		WebServer server= new WebServer(auth);
		server.handle(request);
	}

}
