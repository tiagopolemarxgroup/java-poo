package isidro;

import java.util.Scanner;

public class TesteSwitch {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valor = teclado.nextInt();

    switch(valor){
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        case 3:
            System.out.println("3");
            break;
        default:
            System.out.println("não digitou");
    }

   }
}
