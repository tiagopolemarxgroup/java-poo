import java.util.Scanner;

public class Exercicio1001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int saqueinteiro, saqueDecimal;
        int qtd100, qtd50, qtd20, qtd10, qtd5, qtd2,
        qtd1, qtd050, qtd025, qtd010, qtd005, qtd001;

        int resto;
        
        double valorSaque;
        valorSaque = entrada.nextDouble();

        saqueinteiro = (int) valorSaque;
        valorSaque = valorSaque - saqueinteiro;
        saqueDecimal = (int) (valorSaque * 100);
        
        qtd100 = saqueinteiro / 100;
        resto = saqueinteiro % 100;

        qtd50 = resto / 50;
        resto = resto % 50;

        qtd20 = resto / 20;
        resto = resto % 20;

        qtd10 = resto / 10;
        resto = resto % 10;

        qtd5 = resto / 5;
        resto = resto % 5;

        qtd2 = resto / 2;
        resto = resto % 2;
        qtd1 = resto % 2;

        qtd050 = saqueDecimal / 50;
        resto = saqueDecimal % 50;

        qtd025 = resto / 25;
        resto = resto % 25;

        qtd010 = resto / 10;
        resto = resto % 10;
        
        qtd005 = resto / 5;
        resto = resto % 5; 

        qtd001 = resto % 5;

        System.out.println("Notas:");
        System.out.println(qtd100 + " 100");
        System.out.println(qtd50 + " 50");
        System.out.println(qtd20 + " 20");
        System.out.println(qtd10 + " 10");
        System.out.println(qtd5 + " 5");
        System.out.println(qtd2 + " 2");
        System.out.println(qtd1 + " 1");
        System.out.println("Moedas");
        System.out.println(qtd050 + " 0,50");
        System.out.println(qtd025 + " 0,25");
        System.out.println(qtd010 + " 0,10");
        System.out.println(qtd005 + " 0,5");
        System.out.println(qtd001 + " 0,1");

    }
}
