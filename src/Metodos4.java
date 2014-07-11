//Método com parâmetro e com retorno

import java.util.Scanner;

public class Metodos4 {
    //inicio do método main()
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int x, y, resultado;
        
        System.out.print("Digite o primeiro numero: ");
        x = r.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        y = r.nextInt();
        
        resultado = soma(x,y);
        System.out.print("A soma dos dois: "+resultado);
    } 
    
    
    //inicio do método "soma"
    public static int soma(int n1, int n2){
        int r;
        r=n1+n2;
        return r;         
    } //fim do método soma 
}
