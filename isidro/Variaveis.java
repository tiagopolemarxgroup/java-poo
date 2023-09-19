package isidro;

import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) {
    
       int anosEmDias, qtdAnos, qtdMeses, qtdDias, resto;
           
       Scanner teclado = new Scanner(System.in);
       anosEmDias = teclado.nextInt();
       qtdAnos = anosEmDias / 365;
       resto = anosEmDias % 365;
       qtdMeses = resto / 30;
       qtdDias = resto % 30;

       System.out.println(qtdAnos+ " anos " );
       System.out.println(qtdMeses + " meses");
       System.out.println(qtdDias + " dias");

       
        
    }
    
}
