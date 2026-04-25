import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ex08 {// Exercício 8: Lista de notas e Média
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();
        
        for (int i=0;i<=4;i++){
            System.out.println("Digite a "+(i+1)+"ª nota: ");
            notas.add(sc.nextInt());
        }
        
        double soma = 0;
        
        for (double nota:notas){// For-each: percorre cada 'nota' dentro da lista 'notas'
            soma += nota;
        }
        double media = soma / notas.size();// size() dá a quantidade total
        
        System.out.println("A nota máxima é: "+Collections.max(notas)+"\n A nota minima é: "+Collections.min(notas)+ "\n A média das notas é: "+media);
    }
}
