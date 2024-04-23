public class User {
    private String userID;
    private String passWord;
    private String email;
    private String userType;

    public void createUser(String userID, String passWord, String email, String userType) {
        this.userID = userID;
        this.passWord = passWord;
        this.email = email;
        this.userType = userType;
    }

    public void resetPassword(String userID, String oldPassword, String newPassword){
        if (userID.equals(this.userID) && oldPassword.equals(this.passWord)){
            this.passWord = newPassword;
        }
    }

    
}
