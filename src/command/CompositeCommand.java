package command;

import java.util.ArrayList;
import java.util.List;

import command.framework.Command;

public class CompositeCommand implements Command {
	List<Command> commands= new ArrayList<Command>();
	
	public void add(Command command) {
		commands.add(command);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for (Command command : commands) {
			command.execute();
		}
		
	}

}
