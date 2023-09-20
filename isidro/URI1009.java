package isidro;

import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        double salario, vendas;
        double commissao, salarioTotal;

        System.out.println("Digite seu nome");
        nome = entrada.nextLine();
        System.out.println("Digite o valor do salario");
        salario = entrada.nextDouble();
        System.out.println("Digite o valor das vendas");
        vendas = entrada.nextDouble();

        commissao = vendas * 15 / 100;

        salarioTotal = commissao + salario;
        
        System.out.println("Nome: " + nome + " Salario: " + salario + " vendas: " + vendas + " comissão: " + commissao + " salario total: " + salarioTotal);
        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);
        

    }
    
}
