import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ex10 {// Exercício 10: Remoção de valores
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for(int i=1;i<=6;i++){
            System.out.println("Digite o "+(i)+"º valor para a dicionar à lista: ");
            numeros.add(sc.nextInt());
        }
        
        System.out.println("A lista original é: "+numeros);
        System.out.println("Digite um numero pasra remover: ");
        int numRemove=sc.nextInt();
        
        numeros.remove(Integer.valueOf(numRemove));// Importante: usamos Integer.valueOf para remover o VALOR e não o ÍNDICE
        
        System.out.println("A lista atualizada é: "+numeros);
        
        sc.close();
    }
}
