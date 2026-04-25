import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ex03 {// Exercício 3: Embaralhando dados
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer>numeros = new ArrayList<>();
        
        for (int i=0;i<=5;i++){
            System.out.println("Digite o "+(i+1)+ "º número: ");
            numeros.add(sc.nextInt());
        }
        
        System.out.println("A Lista em ordem é: ");
        System.out.println(numeros);
        
        Collections.shuffle(numeros);// O shuffle mistura os elementos de forma aleatória, como um baralho
        System.out.println("A lista embaralhada é: ");
        System.out.println(numeros);
        
    }
}
