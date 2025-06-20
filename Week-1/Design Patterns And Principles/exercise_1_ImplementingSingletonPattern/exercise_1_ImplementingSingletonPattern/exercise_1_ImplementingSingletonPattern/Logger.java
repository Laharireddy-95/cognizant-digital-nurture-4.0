public class Logger {
    // Holds the single instance of Logger (Singleton instance)
    private static Logger instance;
    
    // Private constructor prevents instantiation from other classes
    private Logger() {
        // private constructor to prevent instantiation
    }
    // Provides the global point of access to the single instance
    public static Logger getInstance() {
        // Creates the instance if it doesn't exist
        if (instance == null) {
            instance = new Logger();
        }
        // Return the single instance
        return instance;
    }
    
    // Method to log messages (for testing )
    public void log(String msg) {
        System.out.println("LOG: " + msg);
    }
}
