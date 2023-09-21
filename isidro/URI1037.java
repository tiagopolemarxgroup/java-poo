package isidro;

import java.util.Scanner;

public class URI1037 {
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          double valor = entrada.nextDouble();

          if(valor >= 0 && valor <= 25.0000){
            System.out.println("[0,25]");
          }else if(valor > 25.0000 && valor <= 50.00000){
            System.out.println("[25,50]");
           }else if(valor > 50.00000 && valor <= 75.00000){
            System.out.println("[50,75]");  
          }else if(valor > 75.00000 && valor <= 100.000000){
            System.out.println("[75,100]");
          }else{
            System.out.println("Fora do intervalo");
          }
    }
}
