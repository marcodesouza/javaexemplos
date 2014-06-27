//Método com parâmetro e sem retorno

import java.util.Scanner;

public class Metodo2 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int x, y;
        
        System.out.print("Digite o primeiro numero: ");
        x = r.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        y = r.nextInt();
        
        imprimir(x,y);
    } 
    //fim do método main()
    
    
    //inicio do método imprimir(n1,n2) 
    public static void imprimir(int n1, int n2){                //
        System.out.println("A soma dos dois: "+ (n1+n2) );  //       
    }
    //fim do método soma() 
}
