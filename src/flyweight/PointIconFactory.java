package flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
	/*PointIcon cafeIcon=new PointIcon(PointType.CAFE, null);
	PointIcon restaurantIcon=new PointIcon(PointType.RESTAURANT, null);
	PointIcon supermarketicon=new PointIcon(PointType.SUPERMARKET, null);
	PointIcon hospitalIcon=new PointIcon(PointType.HOSPITAL, null);
	PointIcon schoolIcon=new PointIcon(PointType.SCHOOL, null);*/
	private Map<PointType,PointIcon> iconmap= new HashMap<PointType, PointIcon>();
	
	public PointIcon getIcon(PointType type) {
		/*if(type == PointType.CAFE)
			return cafeIcon;
		else if(type == PointType.RESTAURANT)
			return restaurantIcon;
		else if(type == PointType.SUPERMARKET)
			return supermarketicon;
		else if(type == PointType.HOSPITAL)
			return hospitalIcon;
		else if(type == PointType.SCHOOL)
			return schoolIcon;
		else
			return null;*/
		if(!iconmap.containsKey(type)) {
			PointIcon icon= new PointIcon(type, null);
			iconmap.put(type, icon);
		}
		return iconmap.get(type);
	}

}
