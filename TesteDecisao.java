import java.util.Scanner;

public class TesteDecisao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        
        System.out.println("Digite um valor inteiro");
        valor = teclado.nextInt();

        if(valor >= 0){
            System.out.println("Positivo");
        }else {
            System.out.println("valor negativo");
        }

        System.out.println("Fim do programa");
    }
}
