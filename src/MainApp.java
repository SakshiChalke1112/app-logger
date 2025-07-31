public class MainApp {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        FileProcessor fileProcessor = new FileProcessor();

        System.out.println("Application Logger Simulator Started...");

        loginService.simulateLoginAttempts();
        fileProcessor.simulateFileProcessing();

        System.out.println("Dummy log generation completed. Check logs/app.log");
    }
}
