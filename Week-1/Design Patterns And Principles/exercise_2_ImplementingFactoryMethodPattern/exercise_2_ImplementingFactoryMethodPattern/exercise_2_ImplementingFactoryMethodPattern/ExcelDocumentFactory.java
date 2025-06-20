// a factory for creating Excel documents
public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        // create and return a new ExcelDocument
        return new ExcelDocument();
    }
} 