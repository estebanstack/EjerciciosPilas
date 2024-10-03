package Ejercicios;

import java.util.*;

public class Ejercicio5 {
    static ArrayList<String> texto= new ArrayList<>();
    static Stack<String> borrado=new Stack<>();
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        texto.add("Hola");
        texto.add("como");
        texto.add("estas");


    }

    public static void editorDeTexto(ArrayList<String> lista){
        mostrarTexto(lista);


        System.out.println("Deseas deshacer lo borrado y/n");
        String opcion=scanner.next();
        if(opcion.equals("y")) {
            while(!borrado.isEmpty()){
                lista.add(borrado.pop());
            }
        }

    }
    public static void mostrarTexto(ArrayList<String> lista){
        System.out.println("El texto escrito es ");
        for(String palabra:lista){
            System.out.println(palabra);
        }
    }

    public static void borrarPalabra(ArrayList<String> lista){
        for(int i =0;i< lista.size();i++) {
                borrado.push(texto.remove(i));

        }
    }


}
