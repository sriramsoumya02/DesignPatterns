package adapter;

import adapter.avaFilters.Caramel;

public class CaramelFilter implements Filter {
	private Caramel caramel;
	
	public CaramelFilter(Caramel caramel) {
		super();
		this.caramel = caramel;
	}

	@Override
	public void apply(Image image) {
		// TODO Auto-generated method stub
		caramel.init();
		caramel.render(image);
	}

}
