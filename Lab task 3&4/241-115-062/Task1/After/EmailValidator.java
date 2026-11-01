public class EmailValidator {

    public boolean isValidEmail(User user) {
        if (user.getEmail() != null &&
            user.getEmail().contains("@")) {
            return true;
        }

        System.out.println("Invalid email format.");
        return false;
    }
}