import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ex04 {// Exercício 4: Maior / Menor
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i=0;i<=5;i++){
            System.out.println("Digite o "+(i+1)+"º número: ");
            numeros.add(sc.nextInt());
        }
        // max() e min() encontram os extremos sem precisar de laços manuais
        int max = Collections.max(numeros);
        int min = Collections.min(numeros);
        
        System.out.println("O maior número é: " + max +"\n O menor número é: "+min);
    }
}
