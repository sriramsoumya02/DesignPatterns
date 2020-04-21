package Proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
	
	Map<String, Ebook> books= new HashMap<String, Ebook>();
	
	public void add(Ebook ebook) {
		books.put(ebook.getFilename(), ebook);
	}
	
	public void openEbook(String filename) {
		if(books.containsKey(filename))
			books.get(filename).show();
	}

}
