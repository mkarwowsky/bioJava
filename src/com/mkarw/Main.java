package com.mkarw;
import java.awt.EventQueue;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("Hello World!");
        EventQueue.invokeLater(new Runnable(){
            @Override public void run(){
                new GUI();
            }
        });
    }
}
