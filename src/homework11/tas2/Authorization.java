package homework11.tas2;
public class Authorization {

    public static void main(String[] args) {

        Data data = new Data("hsgdsdj shdj", "sdjfhkshdf1", "sdjfhkshdf1");

        try {
            System.out.println(checkData(data.getLogin(), data.getPassword(), data.getConfirmPassword()));
        } catch (WrongLoginException | WrongPasswordException e) {
            e.getStackTrace();
        }

    }
    public static boolean checkData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.contains(" ") || login.length() > 20) {
            throw new WrongLoginException();
        } else if ((password.length() > 20) || password.contains(" ") || !isDigitPresent(password)) {
            throw new WrongPasswordException("Incorrect password entry");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Incorrect password entry");
        } else return true;
    }

    public static boolean isDigitPresent(String str) {
        boolean hasDigits = false;
        for (int i = 0; i < str.length() && !hasDigits; i++) {
            if (Character.isDigit(str.charAt(i))) {
                hasDigits = true;
            }
        }
        return hasDigits;
    }
}
