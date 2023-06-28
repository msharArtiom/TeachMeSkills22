package homework11.tas2;

public class Data {

    private String login;
    private String Password;
    private String confirmPassword;

    public Data(String login, String password, String confirmPassword) {
        this.login = login;
        Password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return Password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    @Override
    public String toString() {
        return "Data{" +
                "login='" + login + '\'' +
                ", Password='" + Password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}
