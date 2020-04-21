package Iterate;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
	List<String> URL= new ArrayList<String>();

	public String pop() {
		String x=URL.get(URL.size()-1);
		URL.remove(URL.size()-1);
		return x;
	}

	public void push(String uRL) {
		URL.add(uRL);
	}
	
	public Iterator createIterator() {
		return new ListIterator(this);
	}
	class ListIterator implements Iterator<String>{
		
		private BrowseHistory history;
		private int index;
		
		public ListIterator(BrowseHistory history) {
			super();
			this.history = history;
			this.index=0;
		}

		@Override
		public boolean hasNext() {
			
			return index< history.URL.size() ?true: false;
		}

		@Override
		public String next() {
			return history.URL.get(index++);
		}
		
	}

}
