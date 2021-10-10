
package analisisalgoritmosp3;

import java.util.Random;
import java.util.Scanner;

public class AnalisisAlgoritmosP3 {
    
    public static void main(String[] args) {
        System.out.println("Elija el Algorimo:");
        System.out.println("1. Division 1");
        System.out.println("2. Division 2");
        System.out.println("3. Division 3");
        System.out.println("4. Algoritmo recursivo");
        System.out.println("5. Algoritmo iterativo");
        Scanner sc = new Scanner(System.in);
        String op = sc.nextLine();
        int puntos = 50; 
        switch (op) {
            case "1":
                String ar[][] = new String [puntos][2];
                for (int i = 0; i < puntos; i++) {
                    int n = aleatorio();
                    int div = aleatorio();
                    Division division1 = new Division();
                    ar[i][0]= String.valueOf(division1.Division1(n, div));
                    ar[i][1]= String.valueOf(division1.getCount1());
                }
                DocExcel ex = new DocExcel(ar, "Division1");
                break;
            case "2":
                String ar2[][] = new String [puntos][2];
                for (int i = 0; i < puntos; i++) {
                    int n = aleatorio();
                    int div = aleatorio();
                    Division division2 = new Division();
                    ar2[i][0]= String.valueOf(division2.Division2(n, div));
                    ar2[i][1]= String.valueOf(division2.getCount2());
                }
                DocExcel ex2 = new DocExcel(ar2, "Division2");
                break;
            case "3":
                String ar3[][] = new String [puntos][2];
                for (int i = 0; i < puntos; i++) {
                    int n = aleatorio();
                    int div = aleatorio();
                    Division division3 = new Division();
                    ar3[i][0]= String.valueOf(division3.Division3(n, div));
                    ar3[i][1]= String.valueOf(division3.getCount3());
                }
                DocExcel ex3 = new DocExcel(ar3, "Division3");
                break;
            case "4":
                
                break;
            case "5":
                
                break;
            default:
                System.out.println("No eligio una opcion valida");
        }
    }

    private static int aleatorio() {
         Random random = new Random();
         int value = random.nextInt(100 + 1) + 1;
         return value;
    }
    
}
