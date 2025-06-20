import java.util.Scanner;

public class FactoryMethodPatternTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter document type (word, pdf, excel):");
        String documentType = sc.nextLine().trim().toLowerCase();

        try {
            // getting the appropriate factory based on user input using the provider
            DocumentFactory factory = DocumentFactoryProvider.getFactory(documentType);
            // using the factory to create the specific document
            Document document = factory.createDocument();
            // printing the type of document created
            document.printDocumentType();
        } catch (IllegalArgumentException e) {
            // I handle invalid input by printing an error message
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}