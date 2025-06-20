// provider for DocumentFactory based on the document type string
public class DocumentFactoryProvider {
    public static DocumentFactory getFactory(String type) {
        switch (type) {
            // return a factory for respective documents type
            case "word":
                return new WordDocumentFactory();
            case "pdf":
                return new PdfDocumentFactory();
            case "excel":
                return new ExcelDocumentFactory();
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
} 