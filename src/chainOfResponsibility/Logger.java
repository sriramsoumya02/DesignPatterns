package chainOfResponsibility;

public class Logger extends Handler{

	public Logger(Handler next) {
		super(next);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean doHandle(HttpRequest request) {
		// TODO Auto-generated method stub
		System.out.println("logger");
		//next=new Compressor();
		//next.handle(request);
		return false;
	}

}
