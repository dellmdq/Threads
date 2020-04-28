package com.company;

public class Main {

    public static void main(String[] args) {



        //no lo usamos más debemos instanciar el hilo que va a correr nuestro objeto.
        //SinoThread sinoThread1 = new SinoThread("SI\n");
        //SinoThread sinoThread2 = new SinoThread("NO\n");


        /**No se usa el metodo run. Es secuencial, no tiene nada espcecial con respecto a cualquier otro metodo.
         * Debemos usar start() para poder iniciar el hilo */
        //sinoThread1.run();
        //sinoThread2.run();

        /**Hay que declarar una variable Thread, con solo implementar runnable en la clase no alcanza
         * ya que no estaría coriendo el hilo. En este hilo va correr nuestra instancia.*/
        Thread sinoThread1 = new Thread(new SinoThread("SI\n"));
        Thread sinoThread2 = new Thread(new SinoThread("NO\n"));

        //sinoThread1.setPriority(1);
        //sinoThread2.setPriority(2);//seteamos la prioridad del hilo, si son iguales se intercalan.

        sinoThread1.start();//el metodo start llama al run cuando ya genero el entorno multihilo.
        sinoThread2.start();

        /**SIEMPRE ES MEJOR IMPLEMENTAR LA INTERFAZ RUNNABLE ASÍ QUEDA LIBRE LA HERENCIA POR SI NECESITAMOS
         * EXTENDER DE OTRA CLASE EN EL FUTURO.
         * CHEQUEAR PDF 7.THREADS. DIO LA CLASE DESDE AHI.
         * SECCION CRITICA = todos los threads acceden a la misma sección de memoria, por lo que todos podrían acceder al mismo
         * objeto a la vez, lo que podría escribir/leer un mismo estado de un objeto.
         *
         * SECCIÓN CRITICA = se marca con la palabra synchronized. QUE NO RESUELVE EL PROBLEMA DE LA EXCLUSION MUTUA. UN SOLO HILO puede
         * acceder a la vez a la SECCIÓN CRITICA. La sección critica se pone en la memoria comun que es la que arbitra que hilo puede
         * acceder.
         * */



    }
}
