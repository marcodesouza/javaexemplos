import java.util.Scanner;

public class LerTeclado {
    public static void main(String[] args) {
        
        //declar a variavel "ler" que é do tipo Scanner
        Scanner ler = new Scanner(System.in);
        
        int n;
        double m;
        
        System.out.println("Digite um número Inteiro");
        n = ler.nextInt();
        System.out.println("Voce digitou: "+n);
        
        System.out.println("Digite um número Real");
        m = ler.nextDouble();
        System.out.println("Voce digitou: "+m);
        
        m=Math.pow(3, 3);
        System.out.println("3^3: "+m);
        
    }        
}
