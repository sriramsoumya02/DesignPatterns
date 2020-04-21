package Mediator;

public class ArticleDialogBox {
	ListBox article= new ListBox();
	Button save=new Button();
	TextBox title= new TextBox();
	
	public ArticleDialogBox(){
		article.addEventController(this::articleSelected);
		title.addEventController(this::titleChanged);
		save.addEventController(this::onSave);		
	}
	
	/*@Override
	public void changed() {
		// TODO Auto-generated method stub
		article.attach(this::articleSelected);
		title.attach(this::titleChanged);
		save.attach(this::onSave);
	}*/
	
	public void articleSelected() {
		save.setIsEnabled(true);
		title.setText(article.getSelection());
	}
	public void titleChanged() {
		String content=title.getText();
		boolean isEmpty=(content == null || content.isEmpty());
		save.setIsEnabled(!isEmpty);
	}
	public void onSave() {
		System.out.println("new name stored in DB");
	}
	
	public void simulateUI() {
		article.setSelection("Article1");
		System.out.println("Text :"+title.getText()+" Save button: "+save.getIsEnabled());
		title.setText("");
		System.out.println("Text :"+title.getText()+" Save button: "+save.getIsEnabled());
		title.setText("My Article");
		System.out.println("Text :"+title.getText()+" Save button: "+save.getIsEnabled());
		article.setSelection("Article2");
		System.out.println("Text :"+title.getText()+" Save button: "+save.getIsEnabled());
	}
}
