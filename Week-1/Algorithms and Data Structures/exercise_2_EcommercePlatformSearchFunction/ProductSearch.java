public class ProductSearch {
    public static void main(String[] args) {
        ProductDemoList shop = new ProductDemoList();
        long start, end;
        int productId;

        shop.StoreItem();
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Linear Search");
        int searchId = 4;
        System.out.println("Searching for Product ID: " + searchId);
        start = System.nanoTime();
        productId = shop.linearSearch(searchId);
        end = System.nanoTime();
        if (productId == -1) {
            System.out.println("Result: Product Not Found");
        } 
        else {
            System.out.print("Result: ");
            shop.displayProduct(productId);
        }

        System.out.println("Time Taken: " + (end - start) + " ns");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Binary Search");
        System.out.println("Searching for Product ID: " + searchId);
        start = System.nanoTime();
        productId = shop.binarySearch(searchId);
        end = System.nanoTime();
        if (productId == -1) {
            System.out.println("Result: Product Not Found");
        } else {
            System.out.print("Result: ");
            shop.displayProduct(productId);
        }
        System.out.println("Time Taken: " + (end - start) + " ns");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
    }    
}