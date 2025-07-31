import java.util.logging.Logger;
import java.util.Random;

public class FileProcessor {
    private static final Logger logger = LoggerUtil.getLogger(FileProcessor.class);

    public void simulateFileProcessing() {
        String[] files = { "data.csv", "report.pdf", "", "config.xml", null };
        Random random = new Random();

        for (String fileName : files) {
            logger.info("Started processing file: " + fileName);

            try {
                if (fileName == null || fileName.isEmpty()) {
                    throw new IllegalArgumentException("File name cannot be empty");
                }

                Thread.sleep(random.nextInt(1000));
                logger.info("File processed successfully: " + fileName);
            } catch (Exception e) {
                logger.severe("Error processing file: " + fileName + " - " + e.getMessage());
            }
        }
    }
}
