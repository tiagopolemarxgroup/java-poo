package isidro;

import java.util.Scanner;

public class DecisoesMutiplas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double n1, n2, media;
        System.out.println("Digite sua nota");
        n1 = entrada.nextDouble();
        System.out.println("Digite sua nota");
        n2 = entrada.nextDouble();

        media = (n1 + n2) / 2;

        if(media >= 9.0){
            System.out.println("A");
        }else {
            if(media >= 8.0){
                System.out.println("B");
            }else {
                if(media >= 7.0){
                    System.out.println("C");
                }else {
                    if(media >= 6){
                        System.out.println("D");
                    }else {
                        System.out.println("E");
                    }
                }
            }
        }
    }
}
