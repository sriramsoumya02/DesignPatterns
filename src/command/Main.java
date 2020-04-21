package command;

import command.framework.Button;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService x= new CustomerService();
		addCustomerServiceCommand ac= new addCustomerServiceCommand(x);
		Button b= new Button(ac);
		b.onClick();
		//composite command demo
		CompositeCommand cc= new CompositeCommand();
		cc.add(new BlackAndWhiteCommand());
		cc.add(new ResizeCommand());
		cc.execute();
	}

}
