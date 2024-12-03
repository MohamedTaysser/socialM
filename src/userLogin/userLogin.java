package userLogin;

public class userLogin {
    private String email;
    private String password;

    public  userLogin(String email, String password) {
        this.email = email;
        this.password = password;

    }

    private boolean validateEmail() {
        int at = 0;
        int dot = 0;
        if (this.email == null || this.email.length() < 5) {
            return false;
        }
        for (int i = 0; i < this.email.length(); i++) {
            char x = this.email.charAt(i);

            if (x == '@') {
                at++;
            } else if (x == '.') {
                dot++;
            }
        }
        if (at == 1 && dot > 0 && this.email.indexOf('@') < this.email.lastIndexOf('.')){
            return true;
        }

        return false;
    }

    private boolean validatePassword(){
        if(this.password.length() > 8) {
            return true;
        }
        return false;
    }
    public boolean login(){
    if(this.validateEmail()&&this.validatePassword()){
        //do login logic
        return true;
    }else {
        return false;
    }
    }

}
