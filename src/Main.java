import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static DebtManager afterLife = new DebtManager();
    static String input = " ";

    public static void plannings(){
        do{
            String mainMenu = "What would you want to do? " + "\n * Login " + "\n * profile " + "\n * Update debt " + "\n * Delete debt " + "\n * Sign out";

            System.out.println(mainMenu);
            input = scan.nextLine();

            if(input.equalsIgnoreCase("Login") || mainMenu.equalsIgnoreCase("Apply")){
                afterLife.create();
            } else if (input.equalsIgnoreCase("profile")) {
                afterLife.printDebt();
                
            } else if (input.equalsIgnoreCase("Update debt")) {
                afterLife.updateDebt();
                
            } else if (input.equalsIgnoreCase("Delete debt")) {
                afterLife.delete();
                
            } else if (input.equalsIgnoreCase("Sign out")) {
                System.out.println("Until next time!");

            }else {
                afterLife.printDebt();
            }

        }while(input.equalsIgnoreCase("sign out" ) == false);
        afterLife.print();

    }



    public static void main(String[] args) {

        System.out.println("Welcome to Your future");

        plannings();
        afterLife.save();


    }
}
