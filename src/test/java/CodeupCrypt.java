public class CodeupCrypt {
    public static double version;

    public static String hashPassword(String password) {
        StringBuilder hashedPassword = new StringBuilder();
        for (int i = 0; i < password.length(); i += 1) {
            switch (Character.toLowerCase(password.charAt(i))) {
                case 'a' -> hashedPassword.append(4);
                case 'e' -> hashedPassword.append(3);
                case 'i' -> hashedPassword.append(1);
                case 'o' -> hashedPassword.append(0);
                case 'u' -> hashedPassword.append(9);
                default -> hashedPassword.append(password.charAt(i));
            }
        }
        return hashedPassword.toString();
    }
    public static boolean checkPassword(String hashedPassword, String password) {
        return hashedPassword.equals(hashPassword(password));
    }
}