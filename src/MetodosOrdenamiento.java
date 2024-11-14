import java.util.ArrayList;

public class MetodosOrdenamiento {
        public ArrayList<Integer> burbuja(ArrayList<Integer> arreglo) {
        ArrayList<Integer>  arregloOriginal = new ArrayList<>(arreglo);
        int n = arregloOriginal.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arregloOriginal.get(j) > arregloOriginal.get(j + 1)) {
                    int temp = arregloOriginal.get(j);
                    arregloOriginal.set(j, arregloOriginal.get(j + 1));
                    arregloOriginal.set(j + 1, temp);
                }
            }
        }
        return arregloOriginal;
    }
    public ArrayList<Integer> burbujaAjuste(ArrayList<Integer> arregloOriginal) {
        ArrayList<Integer> arreglo = new ArrayList<>(arregloOriginal);
        int n = arreglo.size();
        boolean intercambiar;
        for (int i = 0; i < n - 1; i++) {
            intercambiar = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo.get(j) > arreglo.get(j + 1)) {
                    int temp = arreglo.get(j);
                    arreglo.set(j, arreglo.get(j + 1));
                    arreglo.set(j + 1, temp);
                    intercambiar = true;
                }
            }
            if (!intercambiar) {
                break;
            }
        }
        return arreglo;
    }
    public ArrayList<Integer> seleccion(ArrayList<Integer> arregloOriginal) {

        ArrayList<Integer> arreglo = new ArrayList<>(arregloOriginal);
        int n = arreglo.size();
    
        for (int i = 0; i < n - 1; i++) {
            int minI = i;
    
            for (int j = i + 1; j < n; j++) {
                if (arreglo.get(j) < arreglo.get(minI)) {
                    minI = j;
                }
            }
    
            if (minI != i) {
                int temp = arreglo.get(i);
                arreglo.set(i, arreglo.get(minI));
                arreglo.set(minI, temp);
            }
        }
    
        return arreglo;
    }
    public ArrayList<Integer> insercion(ArrayList<Integer> arregloOriginal) {

        ArrayList<Integer> arreglo = new ArrayList<>(arregloOriginal);
        int n = arreglo.size();
    
        for (int i = 1; i < n; i++) {
            int key = arreglo.get(i);
            int j = i - 1;

            while (j >= 0 && arreglo.get(j) > key) {
                arreglo.set(j + 1, arreglo.get(j));
                j = j - 1;
            }
            arreglo.set(j + 1, key);
        }
    
        return arreglo;
    }
    public int busquedaBinaria(ArrayList<Integer> arreglo, int z) {

        int inicio = 0;
        int fin = arreglo.size() - 1;
    
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
    

            if (arreglo.get(medio) == z) {
                return medio;
            }
    
            if (arreglo.get(medio) < z) {
                inicio = medio + 1;
            } 
            else {
                fin = medio - 1;
            }
        }   
        return -1; 
    }
}
