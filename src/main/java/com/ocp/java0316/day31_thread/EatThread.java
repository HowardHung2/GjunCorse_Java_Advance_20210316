package com.ocp.java0316.day31_thread;

public class EatThread extends Thread{
    private Cookies cookies;

    public EatThread(Cookies cookies) {
        this.cookies = cookies;
    }

    @Override
    public void run() {
        for (int i=1; i<=10; i++) {
            cookies.eat(i);
            
        }
    }
    
    
}
