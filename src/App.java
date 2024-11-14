import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner (System.in);
        DecimalFormat formato = new DecimalFormat("#0.0000000"); 
        Random añadir = new Random();
        MetodosOrdenamiento ordenar = new MetodosOrdenamiento();
        //Creacion de listas
        ArrayList<Integer> lista0 = new ArrayList<>();          //lista 10
        for (int i = 0; i < 10; i++) {
            lista0.add(añadir.nextInt(30000) + 1);
        }
        ArrayList<Integer> lista1 = new ArrayList<>(lista0);    //lista 100
                
        for (int i = 0; i < 100; i++) {
            lista1.add(añadir.nextInt(30000) + 1);
        }
        ArrayList<Integer> lista2 = new ArrayList<>(lista1);    //lista 1000
        for (int i = 0; i < 1000; i++) {
            lista2.add(añadir.nextInt(30000) + 1);
        }
        ArrayList<Integer> lista3 = new ArrayList<>(lista2);    //lista 5000
        
        for (int i = 0; i < 5000; i++) {
            lista3.add(añadir.nextInt(30000) + 1);
        }
        ArrayList<Integer> lista4 = new ArrayList<>(lista3);    //lista 10000
        
        for (int i = 0; i < 10000; i++) {
            lista4.add(añadir.nextInt(30000) + 1);
        }
        ArrayList<Integer> lista5 = new ArrayList<>(lista4);    //lista 30000

        for (int i = 0; i < 30000; i++) {
            lista5.add(añadir.nextInt(30000) + 1);
        }
        System.out.println("EVALUAR TIEMPO DE EJECUCION : 1. Ordenamientos 2. Busqueda ");
        int i = leer.nextInt();
        switch (i) {
            case 1:
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
                /* 
                System.out.println(" Lista de  30000: ");
                long startTimeBurbuja30000 = System.nanoTime();
                ArrayList<Integer> lista5Burbuja = ordenar.burbuja(lista5);
                long endTimeBurbuja30000 = System.nanoTime();
                double duration30000 = (endTimeBurbuja30000 - startTimeBurbuja30000)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos: "+ formato.format(duration30000) + " s");
                */
                System.out.println("                      *****ORDENAMIENTO:  BURBUJA AJUSTE*****            ");
    
                System.out.println(" Lista de 10 : ");
                long startTimeAjuste10 = System.nanoTime();
                ArrayList<Integer> lista0Ajuste = ordenar.burbuja(lista0);
                long endTimeAjuste10 = System.nanoTime();
                double durationAjuste10 = (endTimeAjuste10 - startTimeAjuste10)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationAjuste10) + " s");
    
                System.out.println(" Lista de 100 : ");
                long startTimeAjuste100 = System.nanoTime();
                ArrayList<Integer> lista1Ajuste = ordenar.burbuja(lista1);
                long endTimeAjuste100 = System.nanoTime();
                double durationAjuste100 = (endTimeAjuste100 - startTimeAjuste100)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationAjuste100) + " s");
    
                System.out.println(" Lista de 1000 : ");
                long startTimeAjuste1000 = System.nanoTime();
                ArrayList<Integer> lista2Ajuste = ordenar.burbuja(lista2);
                long endTimeAjuste1000 = System.nanoTime();
                double durationAjuste1000 = (endTimeAjuste1000 - startTimeAjuste1000)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationAjuste1000) + " s");
    
                System.out.println(" Lista de 5000 : ");
                long startTimeAjuste5000 = System.nanoTime();
                ArrayList<Integer> lista3Ajuste = ordenar.burbuja(lista3);
                long endTimeAjuste5000 = System.nanoTime();
                double durationAjuste5000 = (endTimeAjuste5000 - startTimeAjuste5000)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationAjuste5000) + " s");
    
                System.out.println(" Lista de 10000 : ");
                long startTimeAjuste10000 = System.nanoTime();
                ArrayList<Integer> lista4Ajuste = ordenar.burbuja(lista4);
                long endTimeAjuste10000 = System.nanoTime();
                double durationAjuste10000 = (endTimeAjuste10000 - startTimeAjuste10000)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationAjuste10000) + " s");
                /* 
                System.out.println(" Lista de 30000 : ");
                long startTimeAjuste30000 = System.nanoTime();
                ArrayList<Integer> lista5Ajuste = ordenar.burbuja(lista5);
                long endTimeAjuste30000 = System.nanoTime();
                double durationAjuste30000 = (endTimeAjuste30000 - startTimeAjuste30000)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationAjuste30000) + " s");
                */
                System.out.println("                      *****ORDENAMIENTO:  SELECCION*****            ");
    
                System.out.println(" Lista de 10 : ");
                long startTimeSelec10 = System.nanoTime();
                ArrayList<Integer> lista0Selec = ordenar.seleccion(lista0);
                long endTimeSelec10 = System.nanoTime();
                double durationSelec10 = (endTimeSelec10 - startTimeSelec10)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationSelec10) + " s");
    
                System.out.println(" Lista de 100 : ");
                long startTimeSelec100 = System.nanoTime();
                ArrayList<Integer> lista1Selec = ordenar.seleccion(lista1);
                long endTimeSelec100 = System.nanoTime();
                double durationSelec100 = (endTimeSelec100 - startTimeSelec100)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationSelec100) + " s");
    
                System.out.println(" Lista de 1000 : ");
                long startTimeSelec1000 = System.nanoTime();
                ArrayList<Integer> lista2Selec = ordenar.seleccion(lista2);
                long endTimeSelec1000 = System.nanoTime();
                double durationSelec1000 = (endTimeSelec1000 - startTimeSelec1000)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationSelec1000) + " s");
    
                System.out.println(" Lista de 5000 : ");
                long startTimeSelec5000 = System.nanoTime();
                ArrayList<Integer> lista3Selec = ordenar.seleccion(lista3);
                long endTimeSelec5000 = System.nanoTime();
                double durationSelec5000 = (endTimeSelec5000 - startTimeSelec5000)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationSelec5000) + " s");
    
                System.out.println(" Lista de 10000 : ");
                long startTimeSelec10000 = System.nanoTime();
                ArrayList<Integer> lista4Selec = ordenar.seleccion(lista4);
                long endTimeSelec10000 = System.nanoTime();
                double durationSelec10000 = (endTimeSelec10000 - startTimeSelec10000)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationSelec10000) + " s");
                /* 
                System.out.println(" Lista de 30000 : ");
                long startTimeSelec30000 = System.nanoTime();
                ArrayList<Integer> lista5Selec = ordenar.seleccion(lista5);
                long endTimeSelec30000 = System.nanoTime();
                double durationSelec30000 = (endTimeSelec30000 - startTimeSelec30000)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationSelec30000) + " s");
                */
                System.out.println("                      *****ORDENAMIENTO:  INSERCION*****            ");
    
                System.out.println(" Lista de 10 : ");
                long startTimeIn10 = System.nanoTime();
                ArrayList<Integer> lista0In = ordenar.insercion(lista0);
                long endTimeIn10 = System.nanoTime();
                double durationIn10 = (endTimeIn10 - startTimeIn10)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationIn10) + " s");
    
                System.out.println(" Lista de 100 : ");
                long startTimeIn100 = System.nanoTime();
                ArrayList<Integer> lista1In = ordenar.insercion(lista1);
                long endTimeIn100 = System.nanoTime();
                double durationIn100 = (endTimeIn100 - startTimeIn100)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationIn100) + " s");
    
                System.out.println(" Lista de 1000 : ");
                long startTimeIn1000 = System.nanoTime();
                ArrayList<Integer> lista2In = ordenar.insercion(lista2);
                long endTimeIn1000 = System.nanoTime();
                double durationIn1000 = (endTimeIn1000 - startTimeIn1000)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationIn1000) + " s");
    
                System.out.println(" Lista de 5000 : ");
                long startTimeIn5000 = System.nanoTime();
                ArrayList<Integer> lista3In = ordenar.insercion(lista3);
                long endTimeIn5000 = System.nanoTime();
                double durationIn5000 = (endTimeIn5000 - startTimeIn5000)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationIn5000) + " s");
    
                System.out.println(" Lista de 10000 : ");
                long startTimeIn10000  = System.nanoTime();
                ArrayList<Integer> lista4In = ordenar.insercion(lista4);
                long endTimeIn10000  = System.nanoTime();
                double durationIn10000  = (endTimeIn10000  - startTimeIn10000)/1e+9;
                System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationIn10000) + " s");
            /* 
            System.out.println(" Lista de 30000 : ");
            long startTimeIn30000  = System.nanoTime();
            ArrayList<Integer> lista5In = ordenar.insercion(lista5);
            long endTimeIn30000  = System.nanoTime();
            double durationIn30000  = (endTimeIn30000  - startTimeIn30000)/1e+9;
            System.out.println(" Duracion de ejecucion en segundos : " + formato.format(durationIn30000) + " s");
            */
                break;
            case 2:

                System.out.println("                      *****BUSQUEDA BINARIA : SIN RECURSIVIDAD*****            ");
                System.out.println("Escribe el numero que quieras buscar en las 6 listas");
                int buscar = leer.nextInt();
                
                break;
            default:
                throw new AssertionError();
            
        }

        
    }
}
