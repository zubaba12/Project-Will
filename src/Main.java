import java.util.Scanner;

public class Main {
    Scanner scan = new Scanner(System.in);
    static DebtManager afterLife = new DebtManager();

    public void plannings(){
        String mainMenu = "What would you want to do? " + "Apply/login" + "profile" + "Sign out"
        do{
            System.out.println(mainMenu);
            if(mainMenu.equalsIgnoreCase("Apply/login")){
                afterLife.create();
            } else if (mainMenu.equalsIgnoreCase("profile")) {
                afterLife.printDebt();
                
            } else if (mainMenu.equalsIgnoreCase()) {
                
            }

        }

    }

    public static void main(String[] args) {

            System.out.println("Welcome ");

    }
}
