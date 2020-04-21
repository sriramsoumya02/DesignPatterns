package flyweight;

import java.util.ArrayList;
import java.util.List;



public class PointService {
	private List<Point> points= new ArrayList<Point>();
	PointIconFactory factory;
	
	public PointService(PointIconFactory factory) {
		super();
		this.factory = factory;
	}

	public List<Point> getpoints() {
		Point p1= new Point(1,2,factory.getIcon(PointType.CAFE));
		Point p2= new Point(3,4,factory.getIcon(PointType.HOSPITAL));
		Point p3= new Point(5,6,factory.getIcon(PointType.SCHOOL));
		points.add(p1);
		points.add(p2);
		points.add(p3);
		return points;
	}
}
