import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ex13 {// Exercício 13: Verificação de Duplicados
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> duplicatas = new ArrayList<>();
        
        for (int i =0;i<=12;i++){
            System.out.println("Digite o "+(i+1)+"º número: ");
            numeros.add(sc.nextInt());            
        }
        
        System.out.println(numeros);
        
        // Lógica de comparação entre elementos
        for (int i=0;i<numeros.size();i++){
            for (int j=i+1;j<numeros.size();j++){
                if(numeros.get(i).equals(numeros.get(j))){// Se o valor na posição i for igual ao da posição j, é duplicado
                    duplicatas.add(numeros.get(j));
                }
            }            
        }
        System.out.println("As duplicatas são: "+duplicatas);
        
        sc.close();
    }
}
