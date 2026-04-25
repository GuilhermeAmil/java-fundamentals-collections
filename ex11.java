import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ex11 {// Exercício 11: Sistema de números completo
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for(int i=1;i<=10;i++){
            System.out.println("Digite o "+(i)+"º valor da lista: ");
            numeros.add(sc.nextInt());
        }
        
        System.out.println("A lista original é: "+numeros);
        
        Collections.sort(numeros);
        System.out.println("A lista ordenada é: "+numeros);
        
        Collections.reverse(numeros);// Como já estava ordenada, reverse aqui faz a ordem decrescente
        System.out.println("A lista invertida é: "+numeros);
        
        int maior = Collections.max(numeros);
        int menor = Collections.min(numeros);
        
        System.out.println("O maior valor da lista é: "+maior+ "\nO menor valor da lista é: "+menor);
        
        sc.close();
    }
}
