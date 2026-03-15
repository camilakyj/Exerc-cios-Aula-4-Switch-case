// Camila Aki Yagima Jeronimo 
package dobackofront;
import java.util.Scanner;
public class Exercicio4Aula4 {
   public static void main(String[] args) {
      Scanner leia = new Scanner (System.in);

      char plano;
      double salario, novoSalario;

      System.out.print("Digite o plano de trabalho (A,B ou C): ");
      plano= leia.next().charAt(0);

      System.out.print("Digite o salario atual:");
      salario= leia.nextDouble();

      switch (plano) {
          case 'A':
              novoSalario = salario + (salario * 0.10);
              break;

          case 'B':
              novoSalario = salario + (salario * 0.15);
              break;

          case 'C':
              novoSalario = salario + (salario * 0.20);
              break;

          default:
              System.out.println("Plano invalido");
              return;
      }
          System.out.println("novoSalario" + novoSalario);


              leia.close();




}
}