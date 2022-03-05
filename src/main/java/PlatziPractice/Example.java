package PlatziPractice;

public class Example {
    enum passwordValues {
        WEAK, MEDIUM, STRONG
    }
    public static passwordValues passwordValidator(String password) {
        if (password.length() < 8) {
            return passwordValues.WEAK;
        }
        if (password.matches("[a-zA-Z0-9]")) {
            return passwordValues.MEDIUM;
        }
        return passwordValues.STRONG;
    }
}
