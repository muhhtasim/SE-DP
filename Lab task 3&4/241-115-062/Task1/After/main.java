public class Main {
    public static void main(String[] args) {

        User user = new User("Rahim", "rahim@gmail.com");

        EmailValidator validator = new EmailValidator();
        UserRepository repository = new UserRepository();

        if (validator.isValidEmail(user)) {
            repository.saveToDatabase(user);
        }
    }
}