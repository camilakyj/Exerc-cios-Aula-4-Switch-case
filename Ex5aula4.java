// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;
public class Ex5aula4 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    double num1, num2, resultado;
    char opcao;

    System.out.print("Digite o primeiro numero:");
    num1= entrada.nextDouble();

    System.out.print("Digite o segundo numero:");
    num2= entrada.nextDouble();

    System.out.print("Escolha a operaçã (M,S,P,D):");
    opcao = entrada.next().charAt(0);

    switch (opcao){

        case 'M':
            resultado= (num1+ num2)/2;
            System.out.println("Média:"+ resultado);
            break;

        case 'S':
            if (num1>num2)
                resultado = num1-num2;
            else
                resultado= num1-num2;

        case 'P':
            resultado= num1*num2;
            System.out.println("Produto:"+ resultado);
            break;

        case 'D':
            resultado = num1/num2;
            System.out.println("Divisão:" + resultado);
            break;

        default:
            System.out.println("Opção inválida");

        }
        entrada.close();

    }
}
