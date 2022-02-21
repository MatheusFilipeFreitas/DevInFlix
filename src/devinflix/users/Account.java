package devinflix.users;

public class Account extends User {

    private int numMaxAccount;
    private int numAccount;

    public Account(){
        super();
    }

    public int getNumMaxAccount() {
        return numMaxAccount;
    }

    public void setNumMaxAccount(int numMaxAccount) {
        this.numMaxAccount = numMaxAccount;
    }

    public int getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }

}
