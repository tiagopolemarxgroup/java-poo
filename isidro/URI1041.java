package isidro;

import java.util.Scanner;

public class URI1041 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, y;

        x = teclado.nextDouble();
        y = teclado.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Origem");
        }else if(x > 0 && y > 0){
            System.out.println("q1");
        }else if(x < 0 && y > 0){
            System.out.println("q2");
        }else if(x < 0 && y < 0){
            System.out.println("q3");
        }else{
            if(x > 0 && y < 0){
                System.out.println("q4");
            }
        }
    }
}
