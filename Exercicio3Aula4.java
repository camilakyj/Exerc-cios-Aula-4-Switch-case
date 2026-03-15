// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;
        public class Exercicio3Aula4 {
             public static void main(String[] args) {

                Scanner leia= new Scanner (System.in);
                char periodo;

                System.out.println("Digite o periodo");
                System.out.println("M-Matutino");
                System.out.println("V- Vespertino");
                System.out.println("N-Noturno");
                periodo=leia.next().charAt(0);

                switch (periodo) {
                    case 'M':
                    case 'm':
                        System.out.println("Bom dia");
                        break;

                    case 'V':
                    case'v':
                        System.out.println("Boa tarde");
                        break;

                    case 'N':
                    case'n':
                        System.out.println("Boa noite");
                        break;

                    default:
                            System.out.println("Periodo inválido");

                        leia.close();
                }

            }

        }