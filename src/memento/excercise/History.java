package memento.excercise;

import java.util.Stack;

public class History {
    private Stack<DocumentState> s = new Stack<>();

    public void addDocuState(DocumentState doc) {
        s.push(doc);
    }

    public DocumentState popState() {
        if (!s.isEmpty())
            return s.pop();
        return null;
    }
}
