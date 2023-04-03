package ExemplosVetores;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1(){
        //Criar um vetor para ler 5 numeros inteiros e retorna-los

        int vetorInt[] = new int [5]; //Vetor vazio

        //int vetorInt2[] = new int[]{1,2,3,4,5};    => Vetor já com os VALORES dentro dele

        //Preenchendo o valorInt o 1
        vetorInt[0] = sc.nextInt(); // 1º posição indice 0
        vetorInt[1] = sc.nextInt(); // 2º posição indice 1
        vetorInt[2] = sc.nextInt(); // 3º posição indice 2
        vetorInt[3] = sc.nextInt(); // 4º posição indice 3
        vetorInt[4] = sc.nextInt(); // 5º posição indice 4

        System.out.println("O valor da 1º posição índice 0 é de "+ vetorInt[0]);
        System.out.println("O valor da 2º posição índice 0 é de "+ vetorInt[1]);
        System.out.println("O valor da 3º posição índice 0 é de "+ vetorInt[2]);
        System.out.println("O valor da 4º posição índice 0 é de "+ vetorInt[3]);
        System.out.println("O valor da 5º posição índice 0 é de "+ vetorInt[4]);
    
    }


    public void exemplo2(){
        double vetorDouble[] = new double[10];

       System.out.println("Informe 10 numeros de sua escolha: ");
       vetorDouble[0] = sc.nextDouble();
       vetorDouble[1] = sc.nextDouble();
       vetorDouble[2] = sc.nextDouble();
       vetorDouble[3] = sc.nextDouble();
       vetorDouble[4] = sc.nextDouble();
       vetorDouble[5] = sc.nextDouble();
       vetorDouble[6] = sc.nextDouble();
       vetorDouble[7] = sc.nextDouble();
       vetorDouble[8] = sc.nextDouble();
       vetorDouble[9] = sc.nextDouble();

       System.out.println(); //dar espaçamento

        System.out.println("Os numeros escolhidos, do 10º ao 1º são: ");
        System.out.println(vetorDouble[9]);
        System.out.println(vetorDouble[8]);
        System.out.println(vetorDouble[7]);
        System.out.println(vetorDouble[6]);
        System.out.println(vetorDouble[5]);
        System.out.println(vetorDouble[4]);
        System.out.println(vetorDouble[3]);
        System.out.println(vetorDouble[2]);
        System.out.println(vetorDouble[1]);
        System.out.println(vetorDouble[0]);

    }


    public void exercicio1EXTRA() {
        int vetorInt[] = new int[5];

       System.out.println("Informe 5 numeros de sua escolha: ");
       vetorInt[0] = sc.nextInt();
       vetorInt[1] = sc.nextInt();
       vetorInt[2] = sc.nextInt();
       vetorInt[3] = sc.nextInt();
       vetorInt[4] = sc.nextInt();
      
       int vetorIntB[] = new int[5];
       vetorIntB[0] = vetorInt[0];
       vetorIntB[1] = vetorInt[1];
       vetorIntB[2] = vetorInt[2];
       vetorIntB[3] = vetorInt[3];
       vetorIntB[4] = vetorInt[4];

       System.out.println(""); //Espaçamento

       System.out.println("Numeros do vetor A e vetor B respectivamente: ");
       System.out.println(vetorInt[0]);
       System.out.println(vetorInt[1]);
       System.out.println(vetorInt[2]);
       System.out.println(vetorInt[3]);
       System.out.println(vetorInt[4]);

       System.out.println(""); //Espaçamento

       System.out.println(vetorIntB[0]);
       System.out.println(vetorIntB[1]);
       System.out.println(vetorIntB[2]);
       System.out.println(vetorIntB[3]);
       System.out.println(vetorIntB[4]);
    }


    public void exercicio2EXTRA() {
        int vetorA[] = new int[8];
        vetorA[0] = 10;
        vetorA[1] = 20;
        vetorA[2] = 30;
        vetorA[3] = 40;
        vetorA[4] = 50;
        vetorA[5] = 60;
        vetorA[6] = 70;
        vetorA[7] = 80;

        int vetorB[] = new int [8];
        vetorB[0] = vetorA[0]*2;
        vetorB[1] = vetorA[1]*2;
        vetorB[2] = vetorA[2]*2;
        vetorB[3] = vetorA[3]*2;
        vetorB[4] = vetorA[4]*2;
        vetorB[5] = vetorA[5]*2;
        vetorB[6] = vetorA[6]*2;
        vetorB[7] = vetorA[7]*2;

        System.out.println("Valores Vetor A: ");
        System.out.println(vetorA[0]);
        System.out.println(vetorA[1]);
        System.out.println(vetorA[2]);
        System.out.println(vetorA[3]);
        System.out.println(vetorA[4]);
        System.out.println(vetorA[5]);
        System.out.println(vetorA[6]);
        System.out.println(vetorA[7]);

        System.out.println("");//Espaçamento

        System.out.println("Valores Vetor B: ");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
    }


    public void exercicio3EXTRA() {
        int vetorA[] = new int[15];
        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 7;
        vetorA[7] = 8;
        vetorA[8] = 9;
        vetorA[9] = 10;
       vetorA[10] = 11;
       vetorA[11] = 12;
       vetorA[12] = 13;
       vetorA[13] = 14;
       vetorA[14] = 15;
        

        int vetorB[] = new int [15];
        vetorB[0] = vetorA[0]*vetorA[0];
        vetorB[1] = vetorA[1]*vetorA[1];
        vetorB[2] = vetorA[2]*vetorA[2];
        vetorB[3] = vetorA[3]*vetorA[3];
        vetorB[4] = vetorA[4]*vetorA[4];
        vetorB[5] = vetorA[5]*vetorA[5];
        vetorB[6] = vetorA[6]*vetorA[6];
        vetorB[7] = vetorA[7]*vetorA[7];
        vetorB[8] = vetorA[8]*vetorA[8];
        vetorB[9] = vetorA[9]*vetorA[9];
       vetorB[10] = vetorA[10]*vetorA[10];
       vetorB[11] = vetorA[11]*vetorA[11];
       vetorB[12] = vetorA[12]*vetorA[12];
       vetorB[13] = vetorA[13]*vetorA[13];
       vetorB[14] = vetorA[14]*vetorA[14];
       
       System.out.println("Numeros vetores A: ");
       System.out.println(vetorA[0]);
       System.out.println(vetorA[1]);
       System.out.println(vetorA[2]);
       System.out.println(vetorA[3]);
       System.out.println(vetorA[4]);
       System.out.println(vetorA[5]);
       System.out.println(vetorA[6]);
       System.out.println(vetorA[7]);
       System.out.println(vetorA[8]);
       System.out.println(vetorA[9]);
       System.out.println(vetorA[10]);
       System.out.println(vetorA[11]);
       System.out.println(vetorA[12]);
       System.out.println(vetorA[13]);
       System.out.println(vetorA[14]);

       System.out.println(""); //Espaçamento

       System.out.println("Numeros vetores B: ");
       System.out.println(vetorB[0]);
       System.out.println(vetorB[1]);
       System.out.println(vetorB[2]);
       System.out.println(vetorB[3]);
       System.out.println(vetorB[4]);
       System.out.println(vetorB[5]);
       System.out.println(vetorB[6]);
       System.out.println(vetorB[7]);
       System.out.println(vetorB[8]);
       System.out.println(vetorB[9]);
       System.out.println(vetorB[10]);
       System.out.println(vetorB[11]);
       System.out.println(vetorB[12]);
       System.out.println(vetorB[13]);
       System.out.println(vetorB[14]);

    }

    public void exercicio4EXTRA() {
        int vetorA[] = new int[15];
        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 7;
        vetorA[7] = 8;
        vetorA[8] = 9;
        vetorA[9] = 10;
       vetorA[10] = 11;
       vetorA[11] = 12;
       vetorA[12] = 13;
       vetorA[13] = 14;
       vetorA[14] = 15;
        

        double vetorB[] = new double [15];
        vetorB[0] = Math.sqrt(vetorA[0]);
        vetorB[1] =Math.sqrt(vetorA[1]);
        vetorB[2] = Math.sqrt(vetorA[2]);
        vetorB[3] = Math.sqrt(vetorA[3]);
        vetorB[4] = Math.sqrt(vetorA[4]);
        vetorB[5] = Math.sqrt(vetorA[5]);
        vetorB[6] = Math.sqrt(vetorA[6]);
        vetorB[7] = Math.sqrt(vetorA[7]);
        vetorB[8] = Math.sqrt(vetorA[8]);
       vetorB[10] = Math.sqrt(vetorA[10]);
       vetorB[11] = Math.sqrt(vetorA[11]);
       vetorB[12] = Math.sqrt(vetorA[12]);
       vetorB[13] = Math.sqrt(vetorA[13]);
       vetorB[14] = Math.sqrt(vetorA[14]);
       
       System.out.println("Numeros vetores A: ");
       System.out.println(vetorA[0]);
       System.out.println(vetorA[1]);
       System.out.println(vetorA[2]);
       System.out.println(vetorA[3]);
       System.out.println(vetorA[4]);
       System.out.println(vetorA[5]);
       System.out.println(vetorA[6]);
       System.out.println(vetorA[7]);
       System.out.println(vetorA[8]);
       System.out.println(vetorA[9]);
       System.out.println(vetorA[10]);
       System.out.println(vetorA[11]);
       System.out.println(vetorA[12]);
       System.out.println(vetorA[13]);
       System.out.println(vetorA[14]);

       System.out.println(""); //Espaçamento

       System.out.println("Numeros vetores B: ");
       System.out.println(vetorB[0]);
       System.out.println(vetorB[1]);
       System.out.println(vetorB[2]);
       System.out.println(vetorB[3]);
       System.out.println(vetorB[4]);
       System.out.println(vetorB[5]);
       System.out.println(vetorB[6]);
       System.out.println(vetorB[7]);
       System.out.println(vetorB[8]);
       System.out.println(vetorB[9]);
       System.out.println(vetorB[10]);
       System.out.println(vetorB[11]);
       System.out.println(vetorB[12]);
       System.out.println(vetorB[13]);
       System.out.println(vetorB[14]);
    }
}