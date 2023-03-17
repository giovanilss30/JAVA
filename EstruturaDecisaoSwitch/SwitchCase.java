package Java.EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void letra(){
        System.out.println("Digite uma letra ");
        String letra = sc.nextLine();
        switch (letra){
            case "a": System.out.println(letra + " É uma Vogal ");
            break;

            case "e": System.out.println(letra + " É uma Vogal");
            break;

            case "i": System.out.println(letra + " É uma Vogal");
            break;

            case "o": System.out.println(letra + " É uma Vogal");
            break; 

            case "u": System.out.println(letra + " É uma Vogal");
            break;

            default: System.out.println(letra + " É uma Consoante");
            break;
        }
    }

    public void mes(){
        System.out.println("Digite um Numero de 1 a 12");
        int numero = sc.nextInt();

        switch (numero) {
            case 1: System.out.println("Janeiro é o Mês " + numero);
            break;

            case 2: System.out.println("Fevereiro é o Mês " + numero);
            break;

            case 3: System.out.println("Março é o Mês " + numero);
            break;

            case 4: System.out.println("Abril é o Mês " + numero);
            break;

            case 5: System.out.println("Maio é o Mês " + numero);
            break;

            case 6: System.out.println("Junho é o Mês " + numero);
            break;

            case 7: System.out.println("Julho é o Mês " + numero);
            break;

            case 8: System.out.println("Agosto é o Mês " + numero);
            break;

            case 9: System.out.println("Setembro é o Mês " + numero);
            break;

            case 10: System.out.println("Outubro é o Mês " + numero);
            break;

            case 11: System.out.println("Novembro é o Mês " + numero);
            break;

            case 12: System.out.println("Dezembro é o Mês " + numero);
            break;

            default: System.out.println("Não há Nenhum Mês Relacionado Com Esse " + numero);
        }
    }

}
