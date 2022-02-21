package devinflix.users;

import devinflix.movies.Movie;

import java.util.ArrayList;

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

    public void curtirDescurtirFilme(Movie filme, User usuario, boolean curtir){
        if(curtir){
            filme.setCurtidas(filme.getCurtidas() + 1);
        }else{
            filme.setDescurtidas(filme.getDescurtidas() + 1);
        }
    }

    public void selectMovie(Movie filme, User usuario){

    }
}
