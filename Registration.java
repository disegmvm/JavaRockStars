public class Registration {
    private String email, userName, password;
    void setEmail(String email){
        if (email.endsWith("@yahoo.com")) {
            this.email=email;
        }else{
            System.out.println("Please enter only yahoo email");
        }
    }
    void setUserName(String userName){
        if(userName.length()>6){
            this.userName=userName;
        }else{
            System.out.println("Username must be more than 6 characters");
        }
    }
    void setPassword(String password){
        if ((password!=userName) && (password.length()>6)){
            this.password=password;
        }else{
            System.out.println("Your password is too short or it contains your username");
        }
    }
    void print(){
        System.out.println("Your email is: "+email);
        System.out.println("Your username is "+userName);
        System.out.println("Your password is "+password);
    }

    public static void main(String[] args) {
        Registration user = new Registration();
        user.setEmail("imrobot@yahoo.com");
        user.setUserName("1234567");
        user.setPassword("12345678");
        user.print();
    }
}
