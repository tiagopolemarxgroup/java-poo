package isidro;

import java.util.Scanner;

public class URI1036 {
   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double a, b, c, r1, r2, delta;

    a = entrada.nextDouble();
    b = entrada.nextDouble();
    c = entrada.nextDouble();

    delta = b * b - 4 * a * c;

    if(delta < 0 || a == 0){
        System.out.println("iMPOSSIVEL CALCULAR");
    }else{
        r1 = (-b + Math.sqrt(delta))/(2*a);
        r2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.printf("r1 = %.5f", r1);
        System.out.printf("r2 = %.5f", r2);
    }

   }
    
}
