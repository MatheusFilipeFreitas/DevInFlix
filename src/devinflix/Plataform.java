package devinflix;

import devinflix.interfaces.Menu;
import devinflix.movies.Movie;
import devinflix.users.User;

public class Plataform {

    public void startMovies(){

    }

    public static void main(String[] args) {
        Plataform devinflix = new Plataform();
        User user = new User();
        Menu plataformMenu = new Menu();

        while(true){
            try{
                int optionFirst = plataformMenu.homeMenu();
                switch (optionFirst){
                    case 1:
                        plataformMenu.singinMenu();
                        break;

                    case 2:
                        plataformMenu.singupMenu();
                        break;

                    case 3:
                        plataformMenu.exitMenu();
                        break;

                    default:
                        plataformMenu.errorLog("Opção inválida!");
                        break;
                }
            }catch(Exception e){
                System.out.println(e);
                break;
            }
        }
    }
}
