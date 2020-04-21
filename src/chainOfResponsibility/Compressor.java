package chainOfResponsibility;

public class Compressor extends Handler{

	public Compressor(Handler next) {
		super(next);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean doHandle(HttpRequest request) {
		// TODO Auto-generated method stub
		System.out.println("compressor");
		return false;
	}

}
