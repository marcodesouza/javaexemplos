
import java.util.Scanner;

public class SomaInfinita {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        boolean simNao = true;
        double soma=0, x=0;

        if (simNao) {
            System.out.print("Digite um valor ");
            x=ler.nextDouble();
            
            if ((x >= 50) && (x<=100)) {
                soma=soma+x;
            } else if (x<0) {
                simNao = false;
            }

        }
        
        System.out.print("Valor de soma: " + soma);
    }
}
