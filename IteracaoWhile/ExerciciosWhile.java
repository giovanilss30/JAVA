package IteracaoWhile;

import java.util.Scanner;

public class ExerciciosWhile {
    Scanner sc = new Scanner(System.in);

    public void Exercicio1ExtraVetores() {
        int vetorA[] = new int[]{5,7,9,10,13};
        int vetorB[] = new int[5];
        int i = 0;

        while (i<5) {
            vetorB[i] = vetorA[i];
            System.out.println("Vetor B[" +i+ "]=" + vetorB[i]);
            i++;
        }
    }

    public void Exercicio2ExtraVetores() {
        int vetorA[] = new int[]{1,2,3,4,5,6,7,8};
        int vetorB[] = new int[8];
        int i = 0;

        while (i<8) {
            vetorB[i] = vetorA[i]*2;
            System.out.println("Vetor B[" +i+ "]=" + vetorB[i]);
            i++;
        }
    }

    public void Exercicio3ExtraVetores() {
        int vetorA[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int vetorB[] = new int[15];
        int i = 0;

        while (i<15) {
            vetorB[i] = vetorA[i]*vetorA[i];  // Ou usar MATH.pow 
            System.out.println("Vetor B[" +i+ "]=" + vetorB[i]);
            i++;
        }
    }

    public void Exercicio4ExtraVetores() {
        int vetorA[] = new int[]{4,9,12,25,5,6,7,8,9,10,11,12,13,14,15};
        double vetorB[] = new double[15];
        int i = 0;

        while (i<15) {
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("Vetor B[" +i+ "]=" + vetorB[i]); 
            i++;
        }
    }

    public void Exercicio5ExtraVetores() {
        int vetorA[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int vetorB[] = new int[10];
        int i = 0;

        while (i<10) {
            vetorB[i] = vetorA[i]*i;
            System.out.println("Vetor B[" +i+ "]=" + vetorB[i]);
            i++;
        }
    }

    public void Exercicio6ExtraVetores() {
        int vetorA[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int vetorB[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int vetorC[] = new int[10];
        int i = 0;

        while (i<10) {
            vetorC[i] = vetorA[i]+vetorB[i];
            System.out.println("Vetor C[" +i+ "]=" + vetorC[i]);
            i++;
        }
    }
}
