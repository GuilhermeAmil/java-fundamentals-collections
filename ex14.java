import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ex14 {// Exercício 14: Filtro de Valores
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> maisquedez = new ArrayList<>();
        
        for (int i=0;i<=7;i++){
            System.out.println("Digite o "+(i+1)+"º valor da lista: ");
            numeros.add(sc.nextInt());
        }
        
        System.out.println("A lista original é: "+numeros);
        for (int i=0;i<=7;i++){// Percorre a lista original para filtrar
            if(numeros.get(i)>10){
                maisquedez.add(numeros.get(i));// Só adiciona se for > 10
            }
        }
        
        System.out.println("A lista de maiores que dez é: "+maisquedez);
        sc.close();
    }
}
