package EstruturaDecisãoIfElse;

import java.util.Scanner;

public class DecisãoIfElse {            // IF = SE  ;  ELSE = SE NÃO ou CASO CONTRARIO  ; () = estrutura de condição  e  {} = Acontecimento
    Scanner sc = new Scanner(System.in);
    public void decisãoif(){
        //IF DESENCADEADOS 

        System.out.println("Informe o Preço do Produto:");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;

        //Se preçoproduto>=100<200 então desconto =5%
        if(precoProduto>=100 && precoProduto<200) { // && serve para voce confirmar a programação, já que se estiver na ordem errada de valores e de descontos, seu programa pode dar erro.
            desconto = 5.0;
        }

        //Se precoProduto>=200<300 então desconto =10%
        if(precoProduto>=200 && precoProduto<300){  
            desconto = 10.0;
        }

        //Se precoProduto>=300 então desconto =15%
        if(precoProduto>=300){
            desconto = 15.0;
        }

        //realizar a conta
        double valorDesconto = precoProduto*desconto/100;
        double preçoFinal = precoProduto-valorDesconto;
        System.out.println("O Valor do Produto: R$" + preçoFinal);

    }

    // IF ENCADEADO (IF- ELSE)
    public void decisaoIfElse(){
        System.out.println("Informe o Preço do Produto:");
        double precoProduto = sc.nextDouble();
        double desconto; //variavel nula = existe mais nao tem valor nenhum, apenas foi declarada

        //Estrutura de decisao ENCADEADA If seguida de um Else

        //  }ense if  =  ENCADEAMENTO

        if(precoProduto>=300){  // Condição 1
            desconto = 20.0;

        }else if(precoProduto>=200){   // Condição 2
            desconto = 15.0;

        }else  if (precoProduto>100){   // Condição 3         
            desconto = 10.0;

        }else{ //Depois da palavra ELSE NUNCA se coloca "()", apenas else e {}
            desconto = 0.0;

        }

        //realizar a conta
        double valorDesconto = precoProduto*desconto/100;
        double preçoFinal = precoProduto-valorDesconto;
        System.out.println("O Valor do Produto: R$" + preçoFinal);

    }

    
}
