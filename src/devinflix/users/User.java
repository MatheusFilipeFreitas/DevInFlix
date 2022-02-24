package devinflix.users;

import java.time.LocalDate;

public class User {
    private String userName;
    private String nomeCompleto;
    private String emailContact;
    private LocalDate dataNascimento;
    private String ruaEndereco;
    private String password;
    private int numAccounts;
    private String accountNames[] = new String[numAccounts];

    public User(){

    }

    public User(String userName, String nomeCompleto, String emailContact, LocalDate dataNascimento, String ruaEndereco, String password, int numAccounts){
        this.userName = userName;
        this.nomeCompleto = nomeCompleto;
        this.emailContact = emailContact;
        this.dataNascimento = dataNascimento;
        this.ruaEndereco = ruaEndereco;
        this.password = password;
        this.numAccounts = numAccounts;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setRuaEndereco(String ruaEndereco) {
        this.ruaEndereco = ruaEndereco;
    }

    public String getRuaEndereco() {
        return ruaEndereco;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(String emailContact) {
        this.emailContact = emailContact;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public void setNumAccounts(int numAccounts) {
        this.numAccounts = numAccounts;
    }

    public void addAccountNames(String nameAccount, int index){
        this.accountNames[index] = nameAccount;
    }

    public String getAccountNames(int index){
        return accountNames[index];
    }

}

