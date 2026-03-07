package com.nagaraj.corejava.designpatters.singleton;

public class Singleton {
    private static volatile  Singleton singleton;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(singleton == null){   //first null check
            synchronized (Singleton.class){
                if(singleton == null){  // second null check
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
