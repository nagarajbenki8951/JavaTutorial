package com.nagaraj.corejava.designpatters.singleton;

public class SingletonDemo {
    public static void main(String args[]){
        Singleton singl1 = Singleton.getInstance();
        Singleton singl2 = Singleton.getInstance();
        System.out.println(singl1 + "  "+ singl2);

    }

}
