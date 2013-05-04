
public class FormatarNumeros {
        public static void main(String[] args) {   
                System.out.println("O valor de PI é: "+Math.PI);
                System.out.printf("O valor de PI é: %.3f %n",Math.PI);
                System.out.format("O valor de PI é: %.3f %n",Math.PI);
                //System.out.printf(new Locale("pt", "BR"), "O valor de PI é: %.3f %n",Math.PI);
                //System.out.format(new Locale("pt", "BR"), "O valor de PI é: %.3f %n",Math.PI);            
        }
}
