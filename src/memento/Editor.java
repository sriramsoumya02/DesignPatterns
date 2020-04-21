package memento;
/***
 * 
 * @author Soumya
 * Memonto:used for implementing undo mechanism
 */
public class Editor {
	
	String content;

	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		
	}
	
	public EditorState saveObjectState() {
	return new EditorState(this.content);
	}
	
	public void restoreObjectState(EditorState es) {
		this.content=es.getContent();
	}
		

}
