import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class DebtManager {
    static HashMap<String, Profile> clients = new HashMap<>();
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

    public void create() {
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
//        scan.nextLine();

        System.out.println("Enter a card number ");
        long cardNum = scan.nextInt();
        scan.nextLine();

        Profile client = new Profile(name, debt, username, password, cardNum);

        clients.put(username, client);

        this.printDebt();

    }

    public void updateDebt() {
        this.printDebt();
        System.out.println("Enter your username ");
        input = scan.nextLine();
        System.out.println("Enter your password ");
        input = scan.nextLine();

        for (Profile update : clients.values()) {
            if (update.username.equals(update.getUsername())) {
                System.out.println("What is the new totalDebt?");
                balance = scan.nextDouble();

//                System.out.println("");


            }

        }


    }

    public void delete() {
        this.printDebt();
        System.out.println("Enter your username ");
        input = scan.nextLine();

        System.out.println("Enter your password");
        password = scan.next().charAt(' ');

        for (String delete : clients.keySet()) {
            if (delete.equals(password)) {
                this.clients.remove(password);
            }
        }
    }

    public static void save() {
        try {
            FileOutputStream fileOut = new FileOutputStream("debt.ser");
            // ^ opening a connect to a new file and allowing to connect
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            // ^ streaming data from an object into a file
            out.writeObject(clients);
            // take this object and i'm lobbing it
            out.close();
            // close it once we are done with the file
            fileOut.close();
            // close it once we are done with the file
            System.out.println("Your changes are saved!");


        } catch (IOException i) {
            i.printStackTrace();
            // history of all the methods that were called - allows us to see where the code went wrong.
            //principle of a stack is similar to pringles - last in, first out
        }

    }

    public static void print() {
        HashMap<String, Profile> clients = new HashMap<>();

        try {
            // read object from a file
            FileInputStream file = new FileInputStream("object.ser");
            // create a connect to a file
            ObjectInputStream in = new ObjectInputStream(file);

            // method for deserialization for an object
            clients = (HashMap<String, Profile>) in.readObject();
            // ^ read object and convert data to type Employee

            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            System.out.println(clients);

        } catch (IOException i) {
            i.printStackTrace();

        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }

    }
}
