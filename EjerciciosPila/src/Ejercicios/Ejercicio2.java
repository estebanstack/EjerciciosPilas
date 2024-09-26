package Ejercicios;

import java.util.Stack;

public class Ejercicio2 {
    public static Stack<Integer> pila = new Stack<>();
    public static void main(String[] args) {

        int dato = 900;
        for (int i = 0; i < 10; i ++) {
            pila.push(dato);
            dato += 10;
        }

        System.out.println(pila);

        int numero = 925;

        insertar(pila, numero);

        System.out.println(pila);
    }

    public static void insertar(Stack<Integer> pila, int numero) {
        if (pila.isEmpty() || numero > pila.peek()) {
            pila.push(numero);
            return;
        }

        int elemento = pila.pop();
        insertar(pila, numero);
        pila.push(elemento);
    }
}

