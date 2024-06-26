package HomeWork_21_06;

public class EmailValidator {
    public static void main(String[] args) {
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String email = "my_25@domen-38.de";

        if (email.matches(emailPattern)) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }
}
