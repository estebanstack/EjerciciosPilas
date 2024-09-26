package Ejercicios;

import java.util.ArrayList;
import java.util.Stack;

public class Ejercicio3 {
    static ArrayList<Integer> rebanio1=new ArrayList<>();
    static Stack<Integer> rebanio2=new Stack<>();
    static Stack<Integer> rebanio3=new Stack<>();

    public static void main(String[] args) {
        llenarLista();
        recorrerLista();
        promedioYNumDatosLista(rebanio1);
        promedioYNumDatosPilas(rebanio2);
        promedioYNumDatosPilas(rebanio3);


    }

    public static void llenarLista() {
        for(int i =0; i<45;i++){
            int peso= (int) (Math.random()*(500-150));
            rebanio1.add(peso);
        }
    }
    public static void recorrerLista() {
        for(Integer peso : rebanio1) {
            if (peso >= 200 && peso<= 350) {
                rebanio2.push(rebanio1.remove(peso));
            } else if (peso >= 351 && peso <= 450) {
                rebanio3.push(rebanio1.remove(peso));
            }
        }
    }
    public static void promedioYNumDatosLista(ArrayList<Integer> lista) {
           int contador = 0;
           int pesoSum = 0;
           for (int i = 0; i < lista.size(); i++) {
               contador++;
               pesoSum += lista.get(i);
           }
           int promedio = pesoSum / contador;
           System.out.println("Hay " + contador + " novillos en el rebanio y su peso promedio es de: " + promedio + " kg");
    }
    public static void promedioYNumDatosPilas(Stack<Integer> pila) {
           int contador = 0;
           int pesoSum = 0;
           while(!pila.isEmpty()){
               contador++;
               pesoSum += pila.pop();
           }
           int promedio = pesoSum / contador;
           System.out.println("Hay " + contador + " novillos en el rebanio y su peso promedio es de: " + promedio + " kg");


    }

    /*
    public static void llenarPilas(){
        for(Integer peso: rebanio1){
           if(peso>=200 &&  peso<=350){

           }
        }
    }
     */
}
