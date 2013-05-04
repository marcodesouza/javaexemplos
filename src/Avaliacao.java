
import java.util.Scanner;

public class Avaliacao {
	public static void main(String args[]) {
	       
               Scanner ler = new Scanner(System.in);
               
	       double x=10;
	       double soma=0;

	       System.out.print("Digite um valor ");
	       x=ler.nextDouble();
               
	       soma=soma+x;
               
	       if (soma == 16)
	          System.out.println("Valor igual a 16");                
               else
                  System.out.println("Valor diferente de 16");
                            

    }
}

/*
 class Programa {
	public static void main(string args[]) 
	       ReadStream R = new ReadStream();
	       double x=10,
	       double soma=0;

	       System.out.print("Digite um valor ");
	       x=R.ReadDouble();
	       soma=soma+x;
	       if (soma = 15)
	          System.out.println("Valor igual a 15"); 
                  else;
                     System.out.println("Valor diferente de 15");
    }
}
 */