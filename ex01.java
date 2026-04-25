import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex01 {// Exercício 1: Cadastro e Ordenação
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i=0; i<5;i++){
            System.out.println("Digite um valor: ");
            numeros.add(sc.nextInt());// Adiciona o número lido à lista
        }
        System.out.print("A lista em ordem de digitação é  : \n" + numeros);
        Collections.sort(numeros);// Ordena a lista em ordem crescente
        System.out.println("\n\nA lista em ordem crescente é:\n "+numeros);
        
    }   
}
