
public class ContaTelefonica {

    public static void main(String[] args) {

      double assinatura = 32.00;
      double impulsos = 0.09;
      double chamadaCelular = 0.35;
      double valorConta;

      valorConta = assinatura + ((254 - 90) * impulsos) + (23 * chamadaCelular);

      System.out.printf("Valor Conta = R$ %8.2f\n", valorConta);
      //System.out.println("Valor Conta = R$ " + valorConta);
    }

}