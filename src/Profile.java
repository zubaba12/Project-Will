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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(int totalDebt) {
        this.totalDebt = totalDebt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void print (){
        System.out.println(this.name + this.totalDebt + this.username + this.password + this.cardNumber);
    }



}
