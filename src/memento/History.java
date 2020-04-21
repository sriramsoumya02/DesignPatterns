package memento;

import java.util.ArrayList;
import java.util.List;

public class History {
	List<EditorState> history= new ArrayList<EditorState>();
	
	public void push(EditorState es) {
		history.add(es);
	}
	
	public EditorState pop() {
		int index=history.size()-1;
		if(index >= 0) {
		EditorState es= history.get(index);
		history.remove(index);
		return es;
		}else {
		return null;
		}
	}

}
