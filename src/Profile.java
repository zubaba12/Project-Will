public class Profile {
    private String name;
    private int totalDebt;
//    private
    protected String username;
    protected String password;
    protected int cardNumber;

    public Profile(String name, int totalDebt, String username, String password, int cardNumber) {
        this.name = name;
        this.totalDebt = totalDebt;
        this.username = username;
        this.password = password;
        this.cardNumber = cardNumber;
    }

    public void print (){
        System.out.println(this.name + this.totalDebt + this.username + this.password + this.cardNumber);
    }



}
