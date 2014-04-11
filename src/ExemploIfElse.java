import java.util.Scanner;

public class ExemploIfElse {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
                        
        int x=3;
        int y=3;
        
        if (x == y) {
            System.out.println("Iguais");
        }
        else {
            System.out.println("Diferentes");
        }
    }
}
