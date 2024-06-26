package HomeWork_21_06;

public class PasswordValidator {
    public static void main(String[] args) {
        String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&_\\-+=]).{8,}$";
        String password = "Example@123";

        if (password.matches(passwordPattern)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }
}
