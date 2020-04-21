package flyweight;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PointService ps= new PointService(new PointIconFactory());
		for(Point p:ps.getpoints()) {
			p.draw();
		}
	}

}
