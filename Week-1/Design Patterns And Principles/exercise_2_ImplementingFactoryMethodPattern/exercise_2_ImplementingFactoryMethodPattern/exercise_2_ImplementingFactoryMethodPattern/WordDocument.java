// a Word document and implement the Document interface
public class WordDocument implements Document {
    @Override
    public void printDocumentType() {
        // printing the type of this document
        System.out.println("This is a Word document.");
    }
} 