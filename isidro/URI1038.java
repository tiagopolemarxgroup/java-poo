package isidro;

import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo, quantidade;
        double total = 0;
    
        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();

        switch(codigo){
            case 1:
                total = 4.0 * quantidade;
                break;
            case 2:
               total = 4.5 * quantidade;
               break;  
            case 3:
                 total = 5.0 * quantidade;
                 break;  
            case 4:
                 total = 2.0 * quantidade;
                 break;     
            case 5:
                 total = 1.5 * quantidade;
                 break;
           default:
                System.out.println("valor inválido");    

        }

        System.out.printf("TOTAL: R$ %.2f\n", total);
     
        if(codigo == 1){
            total = 4.0 * quantidade;
        }else if(codigo == 2){
            total = 4.5 * quantidade;
        }else if(codigo == 3){
            total = 5.0 * quantidade;
        }else if(codigo == 4){
            total = 2.0 * quantidade;
        }else if(codigo == 5){
            total = 1.5 * quantidade;
        }else{
            System.out.println("codigo invalido");
        }
            System.out.printf("TOTAL: R$ %.2f\n", total);

    }
    
}
