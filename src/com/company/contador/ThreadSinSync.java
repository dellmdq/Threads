package com.company.contador;

public class ThreadSinSync {

    public static void main(String arg[]){
        Contable c1, c2;
        Contador c = new Contador();
        c1 = new Contable(c);
        c2 = new Contable(c);
        c1.start();
        c2.start();

    }

}
