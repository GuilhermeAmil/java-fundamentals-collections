import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ex09 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i=1;i<=8;i++){
            System.out.println("DIgite o "+(i)+"º numero para adicionar à lista: ");
            numeros.add(sc.nextInt());
        }
        
        int contpar = 0;
        int contimpar = 0;
        
        for (int i=0;i<=7;i++){
            if (numeros.get(i)%2 == 0){
                contpar += 1;
            }else{
                contimpar += 1;
            }
            
        }
        System.out.println("Quantidade de numeros pares na lista: "+contpar +"\n Quantidade de numeros impares na lista: "+contimpar);
        sc.close();
    }
}
