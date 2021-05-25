package day28;

public class LoginFailException extends Exception{

    public LoginFailException(String ErrorMessage) {
        super(ErrorMessage);
    }
    public void HowToDo(){
        System.out.println("請重新登入就好了~~");
    }
}
