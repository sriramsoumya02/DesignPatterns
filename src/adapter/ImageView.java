package adapter;

public class ImageView {
	Image img;

	public ImageView(Image img) {
		super();
		this.img = img;
	}
	
	public void applyFilter(Filter filter) {
		filter.apply(img);
	}

}
