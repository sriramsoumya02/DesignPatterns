package Iterate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowseHistory bw= new BrowseHistory();
		bw.push("1");
		bw.push("2");
		bw.push("3");
		bw.push("4");
		bw.push("5");
		Iterator x= bw.createIterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}

	}

}
