package composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape1= new Shape();
		Shape shape2= new Shape();
		Shape shape3= new Shape();
		Shape shape4= new Shape();
		Group group1= new Group();
		group1.add(shape1);
		group1.add(shape2);
		Group group2= new Group();
		group2.add(shape3);
		group2.add(shape4);
		Group group3= new Group();
		group3.add(group1);
		group3.add(group2);
		//group3.add(shape4);
		//group3.add(shape2);
		group3.render();
		group3.move();
	}

}
