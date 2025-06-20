// PDF document and implement the Document interface
public class PdfDocument implements Document {
    @Override
    public void printDocumentType() {
        // printing the type of this document
        System.out.println("This is a PDF document.");
    }
} 