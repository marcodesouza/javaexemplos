//Método sem parâmetro e sem retorno

import javax.swing.JOptionPane;

public class Metodos1 {
        static int n1=0, n2=0, soma;
        static String sn1, sn2;

    public static void ler() {
        sn1 = JOptionPane.showInputDialog("Digite numero");
        n1 = Integer.parseInt(sn1);

        sn2 = JOptionPane.showInputDialog("Digite outro numero");
        n2 = Integer.parseInt(sn2);
    }
    
    public static void calcular() {
        soma=n1+n2;
    }
    
    public static void imprimir(){
        JOptionPane.showMessageDialog(null, "A soma dos dois: " + soma);
    }

    public static void main(String[] args) {
        ler();
        calcular();
        imprimir();
    }    
}
