package starter.utilities;

public enum LoginUser {

    VALID_USER("tomsmith", "SuperSecretPassword!");

    public final String username;
    public final String password;

    LoginUser(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
