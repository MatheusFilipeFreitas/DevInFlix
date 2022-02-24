package devinflix.interfaces;

import devinflix.users.UserController;

import java.time.LocalDate;

public class UtilityMenu {

    UserController functionsAcc = new UserController();

    //Interfaces utility

    public void space(int i){
        while(i != 0){
            System.out.println("");
            i--;
        }
    }

    public void timer(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //Functions utility


    //Validator

    public int validatorLogin(String username, String password){
        return functionsAcc.login(username, password);
    }

    public boolean validatorExit(String string){
        if(string.equals("Sair") || string.equals("SAIR") || string.equals("sair")){
            return true;
        }else{
            return false;
        }
    }

    public boolean validatorEmail(String email){
        if(email.contains("@") && email.contains(".")){
            return true;
        }
        return false;
    }

    public boolean validatorDate(String date){
        try{
            LocalDate.parse(date);
        }catch(Exception e){
            return false;
        }
        return true;
    }

    public boolean validatorAccUsername(String username){
        return functionsAcc.findUsername(username);
    }
}
