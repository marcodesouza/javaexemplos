import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in );
        double n;
        
        System.out.print("Digite um Número: ");
        n=ler.nextDouble();
        
        if (n%2==0) {
            System.out.println("É par");
        }
        else {
            System.out.println("É impar");
        }
    }
}
