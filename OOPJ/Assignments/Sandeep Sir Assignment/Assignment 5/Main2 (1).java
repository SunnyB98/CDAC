class Logger {
    private static Logger instance;
    private StringBuilder logMessages = new StringBuilder();

    private Logger() {}  // Private constructor to prevent instantiation

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logMessages.append(message).append("\n");
    }

    public String getLog() {
        return logMessages.toString();
    }

    public void clearLog() {
        logMessages.setLength(0);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started.");
        logger.log("An error occurred.");
        
        System.out.println("Current Logs:\n" + logger.getLog());

        logger.clearLog();
        System.out.println("Logs cleared.\nCurrent Logs:\n" + logger.getLog());
    }
}
