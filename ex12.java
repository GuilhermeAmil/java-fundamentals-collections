import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ex12 {// Exercício 12: Ranking simples
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for(int i=0;i<=4;i++){
            System.out.println("Digite o "+(i+1)+"º valor da lista: ");
            numeros.add(sc.nextInt());
        }
        Collections.sort(numeros);// Ordena para que o menor fique em primeiro
        
        for(int i=0;i<=4;i++){
            System.out.println("O "+(i+1)+"º colocado é: "+numeros.get(i));
        }
        sc.close();
    }
}
