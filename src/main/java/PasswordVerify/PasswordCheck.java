package PasswordVerify;

public class PasswordCheck {

    public static boolean securePasswordLength(String password) {
        return password.length() > 5 && password.length() < 11;
    }

    public static boolean securePasswordDigits(String password) {

        return password.matches(".*\\d.*");
    }
    public static boolean securePasswordUpperCase(String password) {
        return password.matches(".*[A-Z].*");
    }
    public static boolean securePassword(String password) {
        if (PasswordCheck.securePasswordLength(password)) {
            if (PasswordCheck.securePasswordDigits(password)) {
                return PasswordCheck.securePasswordUpperCase(password);
            }
        }
        return false;
    }
}
