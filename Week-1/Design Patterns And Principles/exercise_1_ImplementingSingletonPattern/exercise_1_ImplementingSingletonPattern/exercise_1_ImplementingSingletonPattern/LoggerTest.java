public class LoggerTest {
    public static void main(String[] args) {
        // Getting the singleton instance of Logger
        Logger logger1 = Logger.getInstance();
        // Getting the singleton instance of Logger again
        Logger logger2 = Logger.getInstance();

        // Checking if both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Logger is a singleton. Both references are the same instance.");
        } else {
            System.out.println("Logger is NOT a singleton. References are different instances.");
        }

        // Logging messages using both references (should use the same Logger instance)
        logger1.log("This is a log 1 message.");
        logger2.log("This is a log 2 message.");
    }
} 