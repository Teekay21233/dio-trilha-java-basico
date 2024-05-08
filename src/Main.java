import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira numero da conta:");
        int accNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Insira nome do proprietario:");
        String name = sc.nextLine();
        System.out.print("Insira numero da agência:");
        String agencyNum = sc.nextLine();
        System.out.print("Insira valor do saldo:");
        double currency = sc.nextDouble();

        User user = new User(name,agencyNum,accNumber,currency);

        System.out.println(user);
        sc.close();
    }
}