import java.io.IOException;
import java.util.logging.*;
import java.nio.file.*;

public class LoggerUtil {
    private static FileHandler fileHandler;

    static {
        try {
            // Ensure logs directory exists
            Files.createDirectories(Paths.get("logs"));

            // Setup log file with append mode
            fileHandler = new FileHandler("logs/app.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            System.err.println("Logger setup failed: " + e.getMessage());
        }
    }

    public static Logger getLogger(Class<?> clazz) {
        Logger logger = Logger.getLogger(clazz.getName());
        logger.setUseParentHandlers(false); // Disable console logs

        if (fileHandler != null) {
            logger.addHandler(fileHandler);
        }

        return logger;
    }
}
