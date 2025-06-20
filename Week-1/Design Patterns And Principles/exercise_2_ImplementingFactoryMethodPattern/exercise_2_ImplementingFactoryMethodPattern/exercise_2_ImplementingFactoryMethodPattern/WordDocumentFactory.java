// a factory for creating Word documents
public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        // creating and returning a new WordDocument
        return new WordDocument();
    }
} 