import java.util.Scanner;

class Main {
  public static void main(String[] args) {

  int codigoProd = 0;
  int quantidadeVend = 0;
  double valorUnit = 0;
  double valorTotal = 0;
  Scanner ler = new Scanner(System.in);
   
   while (codigoProd < 4327) {
    System.out.println("Digite o código do produto: "); 
    codigoProd = ler.nextInt();
     
    if (codigoProd > 0 && codigoProd < 4327) {
      //System.out.println("Produto código: " + codigoProd);
      System.out.printf("Produto código: %04d %n", codigoProd);
      System.out.println("Digite a quantidade do produto (un): "); 
      quantidadeVend = ler.nextInt();
      System.out.println("Digite o valor do produto R$: "); 
      valorUnit = ler.nextDouble();
      
      valorTotal = valorUnit * (double)quantidadeVend;
      System.out.printf("O total da venda é: R$ %.2f %n", valorTotal);
    } else {
      codigoProd = 5000;
      System.out.println("Obrigado por usar o algoritmo! ");
    }
   }
  }
}