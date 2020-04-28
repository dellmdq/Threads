package com.company.contador;

public class Contable extends Thread {

    Contador contador;

    public Contable (Contador c){

        contador = c;

    }

    public void run(){
        int i;
        long aux;
        for(i = 1; i<=1000000; i++){
            contador.incrementa();
        }
        System.out.println("Contado hasta ahora: " +
                contador.getValor());
    }




}
