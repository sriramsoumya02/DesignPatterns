package command.editor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		History history= new History();
		HTMLDocument html= new HTMLDocument();
		BoldCommand bold= new BoldCommand(history, html);
		html.setContent("Soumya");
		bold.execute();
		System.out.println(html.getContent());
		UndoCommand undo= new UndoCommand(history);
		undo.execute();
		System.out.println(html.getContent());
		/*html.setContent("Harsha");
		bold.execute();
		System.out.println(html.getContent());
		bold.unexecute();
		System.out.println(html.getContent());*/

	}

}
