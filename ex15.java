import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ex15 {// Exercício 15: Menu Interativo
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        int opcao;
        
        do{     
            System.out.println("1. Adicionar numero  | 2.Listar os numeros  | 3.Ordenar Lista  | 4.Mostrar o maior e o menor  | 5.Embaralhar Lista  | 6. Sair");
            System.out.println("Escolha uma opção:"); opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Digite um numero: \n");
                    numeros.add(sc.nextInt());
                    break;
                    
                case 2:                    
                    System.out.println("A lista atual é: "+numeros);
                    break;
                    
                case 3:
                    Collections.sort(numeros);
                    System.out.println("A lista ordenada é: "+numeros);
                    break;
                    
                case 4:
                    System.out.println("O maior numero é: "+ Collections.max(numeros)+". \nO menor numero é: "+Collections.min(numeros));
                    break;
                    
                case 5:
                    Collections.shuffle(numeros);
                    System.out.println("A lista embaralhada é: "+numeros);
                    break;
                    
                case 6: 
                    System.out.println("Saindo do Sistema...");
                    break;
                    
                default:
                    System.out.println("Opção Inválida!");
                    
            }
        }while(opcao !=6);// O loop continua até a opção ser 6
        
        sc.close();
    }
}
