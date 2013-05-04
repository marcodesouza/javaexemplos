import java.util.Scanner;

public class AntecessorSucessor {
   
    public static void main(String[] args) {
	       
               Scanner ler = new Scanner(System.in);
	       int n;


	       System.out.print("Digite um valor ");
	       n=ler.nextInt();

               System.out.println("Sucessor:" + (n+1));
               System.out.println("Antecessor:" + (n-1));
        
    }
}
