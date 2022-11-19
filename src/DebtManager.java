import java.util.HashMap;
import java.util.Scanner;

public class DebtManager {
    HashMap <String, Profile> clients = new HashMap<>();
    Scanner scan = new Scanner(System.in);
    String input;
    Double balance;
    char password;
    public void printDebt() {
        System.out.println();
        for (Profile clients : clients.values()) {
            clients.print();
        }
    }
    public void create(){
        printDebt();
        System.out.println();
        System.out.println("What is your name? ");
        String name = scan.nextLine();

        System.out.println("What are your total amount of debt? ");
        int debt = scan.nextInt();

        System.out.println("create a username? ");
        String username = scan.nextLine();

        System.out.println("create a password? ");
        String password = scan.nextLine();
        scan.nextLine();

        System.out.println("Enter a card number ");
        int cardNum = scan.nextInt();
        scan.nextLine();

        Profile client = new Profile(name, debt, username, password,cardNum);

        clients.put(username, client);

        this.printDebt();

    }
    public void updateDebt(){
        this.printDebt();
        System.out.println("Enter your username ");
        input = scan.nextLine();
        System.out.println("Enter your password ");
        input = scan.nextLine();

        for (Profile update: clients.values()) {
            if (update.username == update.getUsername()){
                System.out.println("What is the new totalDebt?");
                balance = scan.nextDouble();

                System.out.println("");


            }
            
        }


    }
    public void delete(){
        this.printDebt();
        System.out.println("Enter your username ");
        input = scan.nextLine();

        System.out.println("Enter your password");
        password = scan.next().charAt(' ');

        for (String delete : clients.keySet()) {
            if(delete.equals(password)){
                this.clients.remove(password);
            }
        }
    }

}
