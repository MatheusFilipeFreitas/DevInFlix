package devinflix.users;

import devinflix.movies.Movie;

import java.util.ArrayList;
import java.util.Locale;
import java.util.SplittableRandom;

public class UserController {

    ArrayList<User> list = new ArrayList<>();

    public int login(String username, String password){
        for(User u: list) {
            return findAccount(username, password);
        }
        return 0;
    }

    public int findAccount(String username, String password){
        for(User u: list){
            if((username.equals(u.getUserName()) || username.equals(u.getEmailContact()))){
                if(password.equals(u.getPassword())){
                    return 1; //true
                }else{
                    return 2; //password doesnt match
                }
            }
        }
        return 0; //account not found
    }

    public boolean findUsername(String username){
        for(User u: list) {
            if(username.equals(u.getUserName())){
                return true;
            }
        }
        return false;
    }

    public String showName(String username, String password){
        for(User u: list){
            if(findAccount(username, password) == 1){
                return u.getUserName().toUpperCase(Locale.ROOT);
            }
        }
        return null;
    }

    public void addAccountNames(String username, String password, String accountName){
        for(User u: list){
            if(findAccount(username, password) == 1){
                for(int i = 0; i < u.getNumAccounts(); i++){
                    if(u.getAccountNames(i) == null){
                        u.addAccountNames(accountName, i);
                    }
                }
            }
        }
    }

    //select account name edit by id
    public void editAccountNames(String username, String password, int index, String newAccountName){
        for(User u: list){
            if(findAccount(username, password) == 1){
                for(int i = 0; i < u.getNumAccounts(); i++){
                    if(i == index){
                        u.addAccountNames(newAccountName, i);
                    }
                }
            }
        }
    }

    public void curtirDescurtirFilme(Movie filme, boolean curtir){
        if(curtir){
            filme.setCurtidas(filme.getCurtidas() + 1);
        }else{
            filme.setDescurtidas(filme.getDescurtidas() + 1);
        }
    }

    public void selectMovie(Movie filme, User usuario){

    }
}
