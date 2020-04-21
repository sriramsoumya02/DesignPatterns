package memento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Editor editor= new Editor();
		History h= new History();
		editor.setContent("a");
		h.push(editor.saveObjectState());
		editor.setContent("B");
		h.push(editor.saveObjectState());
		editor.setContent("c");
		h.push(editor.saveObjectState());
		System.out.println(editor.content);
		editor.restoreObjectState(h.pop());
		System.out.println(editor.content);
		editor.restoreObjectState(h.pop());
		System.out.println(editor.content);
		editor.restoreObjectState(h.pop());
		System.out.println(editor.content);
	
		
	}

}
