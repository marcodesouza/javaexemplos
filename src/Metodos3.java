//Método sem parâmetro e com retorno

import java.util.Scanner;

public class Metodo3 {

    public static void main(String[] args) {        
        int resultado;        
        resultado = soma();        
        System.out.print("A soma dos dois: "+resultado);
    } 
    
    //inicio do méodo soma()    
    public static int soma(){
        Scanner r = new Scanner(System.in);
        int n1, n2;
        
        System.out.print("Digite o primeiro numero: ");
        n1 = r.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2 = r.nextInt();
        
        return(n1+n2);        
    }
    //fim do método soma()
}
