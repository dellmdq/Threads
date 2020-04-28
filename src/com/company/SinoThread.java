package com.company;



/**al implementar la interfaz runnable nos permite sortear la limitacion de JAVA
 *  de la herecia simple y poder implementar los metodos de runnable*/
public class SinoThread extends SiNo implements Runnable{

    public SinoThread(String s){
        super(s);
    }


    public void run(){
        int i;
        for(i = 1; i <= 20; i++){
            System.out.println(++contador + ":" + siNo + "" );
        }
    }

}
