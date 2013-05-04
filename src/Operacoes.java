
import com.sun.xml.internal.stream.Entity;
import java.util.Scanner;

public class Operacoes {
    public static void main (String[] args){  
        
        Scanner ler = new Scanner(System.in);
        
        // Declaração de variáveis 
        int N1;             //tipo Inteiro
        int N2;
        int N3;
        double x1;          //tipo Real
        double x2;
        double x3;
        String uma_frase;   //tipo String
        String nome;
        
        char um_caracter;   //tipo caracter
        boolean V_ou_F;    //tipo lógico
        
        // atribuir valores às variáveis
        N1 = 6;     N2 = 3;
        x1 = 1.57;   x2 = 3.970;
        //um_caracter = 'c';
        
        // Leitura do Teclado
        System.out.println("Digite um caracter: ");   
        //um_caracter = (char)System.in.read();
        um_caracter = 'c';
        
        System.out.println("Seu Nome: ");        
        nome = ler.nextLine();

        uma_frase = "Instituto Federal Catarinense";
        V_ou_F = true;
        
        // alguns cálculos
        N3 = N1 + N2;
        x3 = x1 + x2;
        
        // Imprimir o resultado
         System.out.println("Carater digitado: " + um_caracter);  
         System.out.println("Nome: " + nome);        
         /*System.out.println("Soma dos Numeros Inteiros " + N3);        
         System.out.println("Soma dos Numeros Reais " + x3);    
         System.out.println("Curso ministrado por: "+ uma_frase); 
         System.out.println("Carater: "+ um_caracter);    
         System.out.println("Verdadeiro ou Falso?: " + V_ou_F);
         System.out.println("Resultado da divisão de x2 por x1: " + x1/x2); 
         * */
    }    
}
