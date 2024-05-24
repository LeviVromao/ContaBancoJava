import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, bem vindo(a), por favor digite seu nome: ");
        Scanner scanName = new Scanner(System.in);
        String clientName = scanName.nextLine();
        System.out.println("Por favor, digite o número da sua Agência: ");
        Scanner scanAgency = new Scanner(System.in);
        String agencyName = scanAgency.nextLine();
        System.out.println("Por favor, digite o numero da sua Conta: ");
        Scanner scanAccNumber = new Scanner(System.in);
        int AccNumber = scanAccNumber.nextInt();
        System.out.println("Por último digite seu Saldo Atual: ");
        Scanner scanBalance = new Scanner(System.in);
        float balance = scanBalance.nextFloat();
        System.out.print("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencyName + ", conta " + AccNumber + " e seu saldo de " + balance
                + " já está disponível para saque.");
    }
}
