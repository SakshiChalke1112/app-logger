import java.util.logging.Logger;
import java.util.Random;

public class LoginService {
    private static final Logger logger = LoggerUtil.getLogger(LoginService.class);

    public void simulateLoginAttempts() {
        String[] users = { "admin", "guest", "user1", "user2" };
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            String username = users[random.nextInt(users.length)];
            boolean success = random.nextBoolean();

            logger.info("Login attempt for user: " + username);

            if (success) {
                logger.info("Login successful for user: " + username);
            } else {
                logger.warning("Login failed for user: " + username);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                logger.severe("Login simulation interrupted: " + e.getMessage());
            }
        }
    }
}
