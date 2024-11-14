import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat formato = new DecimalFormat("#0.0000000"); 
        Random añadir = new Random();
        MetodosOrdenamiento ordenar = new MetodosOrdenamiento();
        //Creacion de listas
        ArrayList<Integer> lista0 = new ArrayList<>();          //lista 10
        for (int i = 0; i < 10; i++) {
            lista0.add(añadir.nextInt(10000) + 1);
        }
        ArrayList<Integer> lista1 = new ArrayList<>(lista0);    //lista 100
                
        for (int i = 0; i < 100; i++) {
            lista1.add(añadir.nextInt(10000) + 1);
        }
        ArrayList<Integer> lista2 = new ArrayList<>(lista1);    //lista 1000
        for (int i = 0; i < 1000; i++) {
            lista2.add(añadir.nextInt(10000) + 1);
        }
        ArrayList<Integer> lista3 = new ArrayList<>(lista2);    //lista 5000
        
        for (int i = 0; i < 5000; i++) {
            lista3.add(añadir.nextInt(10000) + 1);
        }
        ArrayList<Integer> lista4 = new ArrayList<>(lista3);    //lista 10000
        
        for (int i = 0; i < 10000; i++) {
            lista4.add(añadir.nextInt(10000) + 1);
        }
        ArrayList<Integer> lista5 = new ArrayList<>(lista4);    //lista 30000

        for (int i = 0; i < 30000; i++) {
            lista5.add(añadir.nextInt(10000) + 1);
        }
        //Metodo Burbuja en : lista 10
        System.out.println("                      *****ORDENAMIENTO:  BURBUJA*****            ");
        System.out.println(" Lista de  10: ");
        long startTimeBurbuja10 = System.nanoTime();
        ArrayList<Integer> lista0Burbuja = ordenar.burbuja(lista0);
        long endTimeBurbuja10 = System.nanoTime();
        double duration10 = (endTimeBurbuja10 - startTimeBurbuja10)/1e+9;
        System.out.println(" Duracion de ejecucion en segundos: "+ formato.format(duration10) + " s");

        System.out.println(" Lista de  100: ");
        long startTimeBurbuja100 = System.nanoTime();
        ArrayList<Integer> lista1Burbuja = ordenar.burbuja(lista1);
        long endTimeBurbuja100 = System.nanoTime();
        double duration100 = (endTimeBurbuja100 - startTimeBurbuja100)/1e+9;
        System.out.println(" Duracion de ejecucion en segundos: "+ formato.format(duration100) + " s");

        System.out.println(" Lista de  1000: ");
        long startTimeBurbuja1000 = System.nanoTime();
        ArrayList<Integer> lista2Burbuja = ordenar.burbuja(lista2);
        long endTimeBurbuja1000 = System.nanoTime();
        double duration1000 = (endTimeBurbuja1000 - startTimeBurbuja1000)/1e+9;
        System.out.println(" Duracion de ejecucion en segundos: "+ formato.format(duration1000) + " s");

        System.out.println(" Lista de  5000: ");
        long startTimeBurbuja5000 = System.nanoTime();
        ArrayList<Integer> lista3Burbuja = ordenar.burbuja(lista3);
        long endTimeBurbuja5000 = System.nanoTime();
        double duration5000 = (endTimeBurbuja5000 - startTimeBurbuja5000)/1e+9;
        System.out.println(" Duracion de ejecucion en segundos: "+ formato.format(duration5000) + " s");

        System.out.println(" Lista de  10000: ");
        long startTimeBurbuja10000 = System.nanoTime();
        ArrayList<Integer> lista4Burbuja = ordenar.burbuja(lista4);
        long endTimeBurbuja10000 = System.nanoTime();
        double duration10000 = (endTimeBurbuja10000 - startTimeBurbuja10000)/1e+9;
        System.out.println(" Duracion de ejecucion en segundos: "+ formato.format(duration10000) + " s");

        System.out.println(" Lista de  30000: ");
        long startTimeBurbuja30000 = System.nanoTime();
        ArrayList<Integer> lista5Burbuja = ordenar.burbuja(lista5);
        long endTimeBurbuja30000 = System.nanoTime();
        double duration30000 = (endTimeBurbuja30000 - startTimeBurbuja30000)/1e+9;
        System.out.println(" Duracion de ejecucion en segundos: "+ formato.format(duration30000) + " s");
        System.out.println("                      *****ORDENAMIENTO:  BURBUJA AJUSTE*****            ");
    }
}
