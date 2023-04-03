package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o Primeiro Valor");
        double valor1 = sc.nextDouble();

        System.out.println("Informe o Segundo Valor");
        double valor2 = sc.nextDouble();

        if (valor1 > valor2){
            System.out.println("O Primeiro Valor: " + valor1 + "é o Maior");
        }else {
            System.out.println("O Segundo Valor: " + valor2 + " é o Maior");
        }

    }

    public void exercicio2(){
        System.out.println("Informe seu ano de nascimento");
        double dataNascimento = sc.nextDouble();

        if (dataNascimento <= 2007){
            System.out.println("Parabéns Você Já Pode Votar Esse Ano");
        }else{
            System.out.println("Sinto Muito, Você Ainda Não Pode Votar Esse Ano");
        }
 
    }

    public void exercicio3(){
        System.out.println("Digite Sua Senha de 4 Dígitos");
        double senha = sc.nextDouble();

        if (senha == 1234){
            System.out.println("ACESSO PERMITIDO");
        } else{
         System.out.println("ACESSO NEGADO");
        }

    }

    public void exercicio4(){
        System.out.println("Qual a Quantidade De Maçãs Que Deseja Comprar Hoje?");
        double quantidade = sc.nextDouble();

        if (quantidade < 12){
               double MenosDeUmaDuzia = quantidade*0.30;
               System.out.println("O Valor Total Foi De R$: " + MenosDeUmaDuzia);
        } else {
            double MaisDeUmaDuzia = quantidade*0.25;
            System.out.println("O Valor Total Foi De R$: " + MaisDeUmaDuzia) ;
        }

    }

    public void exercicio5(){
        System.out.println("Digite Um Valor Inteiro.");
        int x = sc.nextInt();

        System.out.println("Digite Um Segundo Valor Inteiro.");
        int y = sc.nextInt();

        System.out.println("Digite Um Terceiro Valor Inteiro.");
        int z = sc.nextInt();

        if (x>y && y>z) {
        System.out.println("Os Valores Em Ordem Crescente São: " + z+", " +  y+", " +  x);

        }else if (x>z && z>y){
            System.out.println("Os Valores Em Ordem Crescente São: " + y+", " +  z+", " + x);

        }else if(y>x && x>z){
            System.out.println("Os Valores Em Ordem Crescente São: " + z+", " + x+", " + y);

        }else if(y>z && z>x){
            System.out.println("Os Valores Em Ordem Crescente São: " + x+", " + z+", " + y);

        }else if(z>x && x>y){
            System.out.println("Os Valores Em Ordem Crescente São: " + y+", " + x+", " + z);

        }else { //(z>y && y>x) //
            System.out.println("Os Valores Em Ordem Crescente São: " + x+", " + y+", " + z);
        }

    } 

    public void exercicio6(){
        System.out.println("Qual O Seu Sexo ? (Digite 1 Para Feminino E 2 Para Masculino )");
        Double genero = sc.nextDouble();
        System.out.println("Digite Sua Altura Em Metros Para Que Seja Calculado Seu Peso Ideal.");
        Double Altura = sc.nextDouble();

        if (genero == 1){
            Double mulher = (Altura*62.1) - 44.7;
            System.out.println("Seu Peso Ideal É De: " + mulher +"kg");
        } else {
            Double homem = (Altura*72.7) - 58;
            System.out.println("Seu Peso Ideal É De: " + homem + "kg");

        }

    }

}
