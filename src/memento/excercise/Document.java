package memento.excercise;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public Document() {
        this.fontName = "abcd";
        this.fontSize = 12;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public DocumentState saveDocumentState() {
        return new DocumentState(this.content, this.fontName, this.fontSize);
    }

    public void restoreDocumentState(DocumentState docState) {
        this.content = docState.getContent();
        this.fontSize = docState.getFontSize();
        this.fontName = docState.getFontName();
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize='" + fontSize + '\'' +
                '}';
    }
}
