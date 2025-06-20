// a factory for creating PDF documents
public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        // creating and returning a new PdfDocument
        return new PdfDocument();
    }
} 