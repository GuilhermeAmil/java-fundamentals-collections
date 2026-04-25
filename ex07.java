import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ex07 {// Exercício 7: Substituição de valores
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i=0;i<=5;i++){
            System.out.println("Digite um valor para adicionar à lista: ");
            numeros.add(sc.nextInt());
        }
        
        System.out.println("A lista original é: "+ numeros);
        
        System.out.println("Digite o Valor que deseja substituir: ");
        int valorAntigo = sc.nextInt();
        System.out.println("Agora digite o novo valor: ");
        int novoValor = sc.nextInt();
        
        Collections.replaceAll(numeros, valorAntigo, novoValor);// replaceAll troca TODAS as ocorrências do valor antigo pelo novo
        
        System.out.println("Essa pe a lista atualizada: "+numeros);
    }
}
