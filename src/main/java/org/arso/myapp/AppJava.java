package org.arso.myapp;

public class AppJava {
    public void hello(){
        System.out.println("Hello java");
    }

    public static void main(String[] args) {
        AppJava appJava = new AppJava();
        appJava.hello();
        AppKotlin appKotlin = new AppKotlin();
        appKotlin.hello();
    }
}
