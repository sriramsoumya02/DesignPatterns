package Strategy;

import java.util.ArrayList;
import java.util.List;

public class ImageStore {
	List<String> images= new ArrayList<String>();

	public void store(String img,Compressor compressor,Filter filter) {
		compressor.compress(img);
		filter.doFilter(img);
		images.add(img);
	}

}
