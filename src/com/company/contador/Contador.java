package com.company.contador;

public class Contador {

    private long valor = 0;


    /**Sin estar sincronizados ambos contadores pueden ingresar a este metodo y modificar las variables a la vez.
     * Los dos asignaron el valor a la vez. Por lo que ambos modifican el estado a la vez. Cuando lo que necesitamos
     * es que cada uno modifique el estado que dejo el otro. Uno a la vez. Si la sentencia dentro del metodo fuese atomica
     * esto se soluciona. Por que no puede haber dos hilos a vez modificando la misma linea.
     * PARA EVITAR ESO USAMOS SYNCHRONIZED, solo puede usar el metodo un hilo a la vez.
     * THREAD SAFE signfica que es SYNCHRONIZED.*/
    public synchronized void incrementa(){
        long aux;
        aux = valor;
        aux++;
        valor = aux;
    }

    public long getValor(){
        return valor;
    }


}
