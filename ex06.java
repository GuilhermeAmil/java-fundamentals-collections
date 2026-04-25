import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ex06 {// Exercício 6: Busca binária
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i=0;i<=5;i++){
            System.out.println("Digite um valor para adicionar à lista: ");
            numeros.add(sc.nextInt());
        }
        
        Collections.sort(numeros);// REGRA: A busca binária só funciona se a lista estiver ORDENADA
        System.out.println("Digite o valor que voce deseja saber a posição: ");
        int valor_pedido = sc.nextInt();
        int posicao = Collections.binarySearch(numeros,valor_pedido)+1;// Retorna o índice. Somamos 1 para visualização amigável ao usuário
        
        System.out.println("O valor '"+valor_pedido+"' está na "+posicao+"ª posição");
    }
}
