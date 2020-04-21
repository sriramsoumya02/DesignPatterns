package composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
	List<Component> components= new ArrayList<Component>();
	@Override
	public void render() {
		// TODO Auto-generated method stub
		for (Component component : components) {
			//if(component instanceof Shape)
				component.render();
//			else
//				System.out.println("Group render");
		}
	}
	
	public void add(Component com) {
		components.add(com);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		for (Component component : components) {
			component.move();
		}
	}

}
