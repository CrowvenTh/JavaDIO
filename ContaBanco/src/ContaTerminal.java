import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String NomeCliente;
        Double Saldo;

        System.out.println("Por favor, insira o numero da agencia !");
        numero = scanner.nextInt();
        
        System.out.println("Por favor, insira sua agencia !");
        agencia = scanner.next();

        System.out.println("Por favor, insira seu nome !");
        NomeCliente = scanner.next();

        System.out.println("Por favor, digite seu saldo");
        Saldo = scanner.nextDouble();
            scanner.close();

        System.out.println("Olá "+ NomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo R$"+ Saldo +" já está disponível para saque !");
    }
}
