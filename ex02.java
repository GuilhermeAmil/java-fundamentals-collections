import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ex02 {// Exercício 2: Ordem Inversa
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        
        ArrayList<String> nomes = new ArrayList<>();
        
        for (int i = 1; i<=10;i++){
            System.out.println("Digite um nome: ");
            nomes.add(sc.nextLine());// Lê a linha completa (String)            
        }
        
        System.out.println("A lista em ordem de digitação é: ");
        System.out.println(nomes);
        
        Collections.reverse(nomes);// O método reverse apenas inverte as posições atuais, não ordena
        System.out.println("A lista em ordem reversa é: ");        
        System.out.println(nomes);

    }
}
