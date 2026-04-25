import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ex05 {// Exercício 5: Ocorrência de um valor
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // Crie a lista com alguns valores repetidos para teste
        for (int i=0;i<=9;i++){
            System.out.println("Digite um valor para adicionar à lista: ");
            numeros.add(sc.nextInt());
        }
        
        System.out.println("Digite o valor que deseja procurar na lista: ");
        int valor_procurado = sc.nextInt();        
        int quantidade = Collections.frequency(numeros, valor_procurado);// frequency() conta quantas vezes o objeto exato aparece na lista
        
        System.out.println("O valor '" +valor_procurado+"' aparece " +quantidade+ " vezes na lista!");
        
    }
}
