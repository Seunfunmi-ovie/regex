public class Password {

    public static void main(String[] args) {
        String password = "seunfunmi@1";
        System.out.println(isValidPassword(password));
    }

    public static boolean isValidPassword(String password) {
        if (password == null) {
            return false;
        }

        String regex = "(?=.*\\d)(?=.*[^A-Za-z0-9\\s])\\S{8,16}";
        return password.matches(regex);
    }
}