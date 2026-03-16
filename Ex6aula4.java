// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;
public class Ex6aula4 {
public    static void main(String[] args) {

    Scanner entrada= new Scanner(System.in);

    int codigo,quantidade;
    double preco = 0, total = 0;
    String produto = "";

    System.out.print("Digite o código do produto:");
    codigo = entrada.nextInt();

    System.out.print("Digite a quantidade:");
    quantidade = entrada.nextInt();

    switch (codigo) {

        case 100:
            produto = "Cachorro Quente";
            preco = 1.20;
            break;

        case 101:
            produto = "Bauru Simples";
            preco = 1.30;
            break;

        case 102:
            produto = "Bauro com ovo";
            preco = 1.50;
            break;

        case 103:
            produto = "Hamburguer";
            preco = 1.20;
            break;

        case 104:
            produto = "Cheeseburger";
            preco = 1.30;
            break;

        case 105:
            produto = "Refrigerante";
            preco = 1.00;
            break;

        default:
            System.out.println("Código inválido");
            return;
    }
        total = preco * quantidade;

            System.out.println("Produto:"+ produto);
            System.out.println("Total a pagar: R$"+ total);
            entrada.close();





        }
    }

