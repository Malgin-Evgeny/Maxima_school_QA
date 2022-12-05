public class LoginData {
    public LoginData(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        System.out.println("LoginData.getLogin = " + login);
        return login;
    }

    public String getPassword() {
        System.out.println("LoginData.getPassword = " + password);
        return password;
    }

    private String login;
    private String password;
}
