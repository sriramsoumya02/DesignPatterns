package adapter;

import adapter.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter{

	@Override
	public void apply(Image image) {
		// TODO Auto-generated method stub
		init();
		render(image);
	}

}
