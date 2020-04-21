package flyweight;

public class PointIcon {
	private final PointType type;
	
	private final byte[] image;
	
	public PointIcon(PointType type,byte[] image) {
		this.image=image;
		this.type=type;
	}
	public PointType getType() {
		return type;
	}

}
