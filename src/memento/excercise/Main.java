package memento.excercise;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        History h = new History();
        doc.setContent("Soumya");
        h.addDocuState(doc.saveDocumentState());
        System.out.println(doc.toString());
        doc.setFontName("XYZ");
        h.addDocuState(doc.saveDocumentState());
        System.out.println(doc.toString());
        doc.setFontSize(10);
        h.addDocuState(doc.saveDocumentState());
        System.out.println(doc.toString());
        doc.restoreDocumentState(h.popState());
        System.out.println(doc.toString());
        doc.restoreDocumentState(h.popState());
        System.out.println(doc.toString());
    }
}
