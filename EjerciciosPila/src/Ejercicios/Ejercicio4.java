package Ejercicios;

import java.util.ArrayList;
import java.util.Stack;

//son 9 pilas de 8 pilas
public class Ejercicio4 {
    static ArrayList<ArrayList<Stack>> bodega=new ArrayList<>();
    public static void main(String[] args) {
        llenarBodega();
    }

    public static void llenarBodega() {
        String letra="A";
        int entero=1000;
        String numero;
        for(int i=0;i<3;i++){
            ArrayList<Stack> listaPila=new ArrayList<>();
            for(int j=0;j<3;j++){
                Stack<String> stack=new Stack<>();
                for(int k=0;k<3;k++){
                    numero=letra+entero;
                    stack.push(numero);
                    entero++;
                }
                listaPila.add(stack);
            }
            bodega.add(listaPila);
        }
        System.out.println(bodega);

    }
}
