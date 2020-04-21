package command.editor;

public class BoldCommand implements Undoable{
	
	private History history;
	private HTMLDocument doc;
	private String prevContent;
	
		public BoldCommand(History history,HTMLDocument doc) {
		super();
		this.history = history;
		this.doc=doc;
		}

	

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		 this.prevContent= doc.getContent();
		 doc.makeBold();
		 history.push(this);
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		doc.setContent(prevContent);
		
	}
	

}
