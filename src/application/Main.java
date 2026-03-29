package application;
import application.entities.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with data to create your account:");
        System.out.print("Id account:");
        int id = sc.nextInt();
        sc.nextLine(); //"Limpando" o scanner, pois o enter fica do scanner anterior, só o nextLine pega
        System.out.print("Name account:");
        String name = sc.nextLine();
        User u = new User(id, name);
        System.out.print("Account created, do you want to do an initial deposit(S/N):");
        char confirmation = sc.next().charAt(0); //ler o caracter no local 0

        confirmation = Character.toUpperCase(confirmation); //confirmation ta recebendo um caracter com a função upper case
        double deposit = 0;
        if (confirmation == 'S') {
            System.out.print("Enter the value of deposit:");
            deposit = sc.nextDouble();

            u.deposit(deposit);
        }

        System.out.println(u);

        System.out.print("Enter the quantity of deposit:");
        deposit = sc.nextDouble();
        u.deposit(deposit);

        System.out.println(u);

        System.out.printf("Enter the quantity of withdraw:");
        double withdraw = sc.nextDouble();
        u.withDraw(withdraw);
        System.out.println(u);


        sc.close();
    }
}