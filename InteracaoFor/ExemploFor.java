package InteracaoFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("O N° Da Iteração É " + i);
        }
    }

    public void exemplo2() {
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) { // length = tamanho do VETOR
        System.out.println("Digite o Valor Do Vetor [" + i + "]");
            
        }
    }
}
