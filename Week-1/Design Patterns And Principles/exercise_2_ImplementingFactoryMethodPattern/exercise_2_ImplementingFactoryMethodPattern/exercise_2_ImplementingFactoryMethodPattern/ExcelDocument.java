//represents an Excel document and implement the Document interface
public class ExcelDocument implements Document {
    @Override
    public void printDocumentType() {
        // print the type of this document
        System.out.println("This is an Excel document.");
    }
} 