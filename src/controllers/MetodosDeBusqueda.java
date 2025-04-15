package controllers;

public class MetodosDeBusqueda {
    public static int busquedaLineal(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return i; // Devolver el índice si se encuentra
            }
        }
        return -1; // Devolver -1 si no se encuentra
    }
    
}
