package com.ocp.java0316.day28;

public class LoginCheckMain {
    public static void main(String[] args) {
        // 三層式架構 主程式 <-> Service(LoginService) <-> 資料庫
        String name = "admin";
        String password = "1234";
        LoginService service = new LoginService();
        try {
            System.out.println(service.login(name, password));
        } catch (LoginFailException e) {
            System.out.println(e.getMessage());
            e.HowToDo();
        }
        
    }
}
