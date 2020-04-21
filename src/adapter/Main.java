package adapter;

import adapter.avaFilters.Caramel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ImageView iv= new ImageView(new Image());
			//iv.applyFilter(new VividFilter());
			iv.applyFilter(new CaramelFilter(new Caramel()));
	}

}
