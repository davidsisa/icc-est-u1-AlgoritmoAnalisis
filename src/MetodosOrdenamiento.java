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
}
