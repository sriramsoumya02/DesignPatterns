package command;

import command.framework.Command;

public class addCustomerServiceCommand implements Command{
	
	CustomerService customerservice;
	
	public addCustomerServiceCommand(CustomerService customerservice) {
		super();
		this.customerservice = customerservice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		customerservice.addCutomerService();
	}

}
