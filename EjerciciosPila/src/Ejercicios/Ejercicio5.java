package Ejercicios;

import java.util.Stack;

public class Ejercicio5 {
    public static Stack<String> pila = new Stack<>();

    public static void main(String[] args) {
        generarApartamentos();
        System.out.println(pila);
        facturarTorrePiso(pila, 'C', 6);
        System.out.println(pila);
    }

    public static void generarApartamentos() {
        char[] torres = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char torre : torres) {
            for (int piso = 1; piso <= 6; piso++) {
                for (int apto = 1; apto <= 6; apto++) {
                    String apartamento = torre + Integer.toString(piso) + (apto < 10 ? "0" + apto : "" + apto);
                }
            }
        }
    }

    public static void facturarTorrePiso(Stack<String> pila, char torreEspecifica, int pisoEspecifico) {
        if (pila.isEmpty()) {
            return;
        }

        String apartamento = pila.pop();
        char torre = apartamento.charAt(0);
        int piso = apartamento.charAt(1) - '0';
        facturarTorrePiso(pila, torreEspecifica, pisoEspecifico);
        if (torre == torreEspecifica && piso == pisoEspecifico) {
            System.out.println("Torre " + torre + ", Piso " + piso + ", Apartamento " + apartamento + " - Cuota: $250000");
        }
        pila.push(apartamento);
    }
}
