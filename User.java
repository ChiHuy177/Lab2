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

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    

    
}
