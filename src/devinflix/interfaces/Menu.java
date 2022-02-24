package devinflix.interfaces;

import devinflix.users.User;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in); //For confirmation
    Scanner input3 = new Scanner(System.in);
    UtilityMenu functionsMenu = new UtilityMenu();

    //Global Variables
    int topSide = 7;
    int bottomSide = 4;
    int operationID = 0;

    //Global Menus


    public void errorLog(String typeError){
        functionsMenu.space(topSide);
        System.out.println("|----------- ERROR ------------|");
        System.out.println("|            CODE:             |");
        System.out.println("|------------------------------|");
        System.out.println("  " + typeError);
        System.out.println("--------------------------------");
        functionsMenu.space(bottomSide);
        functionsMenu.timer();

        functionsMenu.space(topSide);
        System.out.println("|------------ SYS -------------|");
        System.out.println("| Backing to menu...           |");
        System.out.println("|------------------------------|");
        functionsMenu.space(bottomSide);
        functionsMenu.timer();
    }

    public void exitMenu(){

        System.out.println("** DEV IN FLIX **");
        System.out.println("");
        System.out.println("|------------ SYS -------------|");
        System.out.println("| 1 - Quero sair!              |");
        System.out.println("| 2 - Cliquei errado!          |");
        System.out.println("|                              |");
        System.out.println("|                              |");
        System.out.println("| DIGITE A OPERAÇÃO ABAIXO     |");
        System.out.println("|------------------------------|");
        System.out.println("");

        System.out.printf(":: ");
        operationID = input.nextInt();

        switch (operationID){

            case 1:
                System.exit(0);
                break;

            case 2:
                break;

            default:
                errorLog("Opção inválida!");
                break;
        }
    }

    //Fases

    public int homeMenu(){

        functionsMenu.space(topSide);
        System.out.println("** BEM VINDO AO DEV IN FLIX **");
        System.out.println("");
        System.out.println("|------------ SYS -------------|");
        System.out.println("| 1 - Já tenho conta!          |");
        System.out.println("| 2 - Sou novo, criar conta!   |");
        System.out.println("| 3 - Sair                     |");
        System.out.println("|                              |");
        System.out.println("| DIGITE A OPERAÇÃO ABAIXO     |");
        System.out.println("|------------------------------|");
        System.out.println("");

        System.out.printf(":: ");
        operationID = input.nextInt();

        return operationID;
    }

    public void singinMenu(){

        String username;
        String password;

        functionsMenu.space(topSide);
        System.out.println("Username ou email: ");
        username = input.next();

        functionsMenu.space(topSide);
        System.out.println("Password: ");
        password = input.next();

        //implementar função while

        switch (functionsMenu.validatorLogin(username, password)){

            case 0:
                break;

            case 1:
                if(functionsMenu.validatorLogin(username, password) == 1){
                    clientMenu(username, password);
                }else{
                    errorLog("Verifique o seu username ou senha!");
                }
                break;

            case 2:
                errorLog("Senha incorreta!");
                break;

        }
    }

    public void singupMenu() {

        //user
        String nome;
        String email;
        String dataNascimento; //2022-01-01
        String endereco;
        //loops
        boolean nameLoop = true; //Controls the "do" loop (name)
        boolean emailLoop = true;//Controls the "do" loop (email)
        boolean dateLoop = true;//Controls the "do" loop (date)
        boolean enderecoLoop = true;//Controls the "do" loop (endereco)

        functionsMenu.space(topSide);
        System.out.println("|------------ LOG -------------|");
        System.out.println("| Processing...               |");
        System.out.println("|------------------------------|");
        functionsMenu.space(bottomSide);
        functionsMenu.timer();

        do{
            functionsMenu.space(topSide);
            System.out.println("       ** DEV IN FLIX **");
            System.out.println("");
            System.out.println("|------- CREATE ACCOUNT -------|");
            System.out.println("| DIGITE O SEU NOME            |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("| DIGITE \"SAIR\" PARA VOLTAR  |");
            System.out.println("|------------------------------|");
            System.out.println("");

            System.out.println(":: ");
            nome = input1.nextLine();

            if(functionsMenu.validatorExit(nome) != true){

                System.out.println("|------------------------------|");
                System.out.println("");
                System.out.println(" Nome: " + nome );
                System.out.println("");
                System.out.println("|------------------------------|");
                System.out.println("Confirma o seu nome?");
                System.out.println("OBS: responda com \"s\" ou \"n\"");
                System.out.println("");

                System.out.println(":: ");
                String nameConfirmation = input2.next();

                switch (nameConfirmation){

                    case "s":

                        functionsMenu.space(topSide);
                        System.out.println("|------------ LOG -------------|");
                        System.out.println("| Processing...               |");
                        System.out.println("|------------------------------|");
                        functionsMenu.space(bottomSide);
                        functionsMenu.timer();

                        do{

                            functionsMenu.space(topSide);
                            System.out.println("       ** DEV IN FLIX **");
                            System.out.println("");
                            System.out.println("|------- CREATE ACCOUNT -------|");
                            System.out.println("| DIGITE O SEU EMAIL            |");
                            System.out.println("|                              |");
                            System.out.println("|                              |");
                            System.out.println("|                              |");
                            System.out.println("| DIGITE \"SAIR\" PARA VOLTAR  |");
                            System.out.println("|------------------------------|");
                            System.out.println("");

                            System.out.println(":: ");
                            email = input1.next();

                            if(functionsMenu.validatorExit(email) == false){

                                if(functionsMenu.validatorEmail(email) == false){
                                    errorLog("Email inválido!");
                                }else{
                                    System.out.println("|------------------------------|");
                                    System.out.println("");
                                    System.out.println(" Email: " + email );
                                    System.out.println("");
                                    System.out.println("|------------------------------|");
                                    System.out.println("Confirma o seu email?");
                                    System.out.println("OBS: responda com \"s\" ou \"n\"");
                                    System.out.println("");

                                    System.out.println(":: ");
                                    String emailConfirmation = input2.next();

                                    switch (emailConfirmation){

                                        case "s":
                                            do{
                                                functionsMenu.space(topSide);
                                                System.out.println("       ** DEV IN FLIX **");
                                                System.out.println("");
                                                System.out.println("|------- CREATE ACCOUNT -------|");
                                                System.out.println("| DIGITE A DATA DE NASCIMENTO  |");
                                                System.out.println("| EX: 2022-01-01               |");
                                                System.out.println("|                              |");
                                                System.out.println("|                              |");
                                                System.out.println("| DIGITE \"SAIR\" PARA VOLTAR  |");
                                                System.out.println("|------------------------------|");
                                                System.out.println("");

                                                System.out.println(":: ");
                                                dataNascimento = input1.next();

                                                if(functionsMenu.validatorExit(dataNascimento) != true){
                                                    if(functionsMenu.validatorDate(dataNascimento) == false){
                                                        errorLog("Date Format Invalid! Follow the example!");
                                                    }else{
                                                        System.out.println("|------------------------------|");
                                                        System.out.println("");
                                                        System.out.println(" Data de Nascimento: " + dataNascimento );
                                                        System.out.println("");
                                                        System.out.println("|------------------------------|");
                                                        System.out.println("Confirma a sua data?");
                                                        System.out.println("OBS: responda com \"s\" ou \"n\"");
                                                        System.out.println("");

                                                        System.out.println(":: ");
                                                        String dateConfirmation = input2.next();

                                                        switch (dateConfirmation){

                                                            case "s":

                                                                functionsMenu.space(topSide);
                                                                System.out.println("|------------ LOG -------------|");
                                                                System.out.println("| Processing...               |");
                                                                System.out.println("|------------------------------|");
                                                                functionsMenu.space(bottomSide);
                                                                functionsMenu.timer();

                                                                do{

                                                                    functionsMenu.space(topSide);
                                                                    System.out.println("       ** DEV IN FLIX **");
                                                                    System.out.println("");
                                                                    System.out.println("|------- CREATE ACCOUNT -------|");
                                                                    System.out.println("| DIGITE O SEU ENDEREÇO        |");
                                                                    System.out.println("|                              |");
                                                                    System.out.println("|                              |");
                                                                    System.out.println("|                              |");
                                                                    System.out.println("| DIGITE \"SAIR\" PARA VOLTAR  |");
                                                                    System.out.println("|------------------------------|");
                                                                    System.out.println("");

                                                                    System.out.println(":: ");
                                                                    endereco = input3.nextLine();

                                                                    if(functionsMenu.validatorExit(endereco) != true){

                                                                        System.out.println("|------------------------------|");
                                                                        System.out.println("");
                                                                        System.out.println(" Endereço: " + endereco );
                                                                        System.out.println("");
                                                                        System.out.println("|------------------------------|");
                                                                        System.out.println("Confirma o seu endereço?");
                                                                        System.out.println("OBS: responda com \"s\" ou \"n\"");
                                                                        System.out.println("");

                                                                        System.out.println(":: ");
                                                                        String enderecoConfirmation = input2.next();

                                                                        switch (enderecoConfirmation){

                                                                            case "s":
                                                                                creatingUserMenu(nome, email, dataNascimento, endereco);
                                                                                enderecoLoop=false;
                                                                                break;

                                                                            case "n":
                                                                                functionsMenu.space(topSide);
                                                                                System.out.println("|------------ LOG -------------|");
                                                                                System.out.println("| Returning to edit...         |");
                                                                                System.out.println("|------------------------------|");
                                                                                functionsMenu.space(bottomSide);
                                                                                functionsMenu.timer();
                                                                                enderecoLoop=true;
                                                                                break;

                                                                            default:
                                                                                errorLog("Opção inválida!");
                                                                                break;

                                                                        }

                                                                    }else{

                                                                        enderecoLoop = false;

                                                                    }

                                                                }while(enderecoLoop == true);
                                                                dateLoop = false;
                                                                break;

                                                            case "n":
                                                                functionsMenu.space(topSide);
                                                                System.out.println("|------------ LOG -------------|");
                                                                System.out.println("| Returning to edit...         |");
                                                                System.out.println("|------------------------------|");
                                                                functionsMenu.space(bottomSide);
                                                                functionsMenu.timer();
                                                                dateLoop = true;
                                                                break;

                                                            default:
                                                                errorLog("Opção inválida!");
                                                                break;
                                                        }

                                                    }
                                                        //Create validator for date!

                                                }else{

                                                    dateLoop = false;

                                                }

                                            }while(dateLoop == true);
                                            emailLoop=false;
                                            break;

                                        case "n":
                                            functionsMenu.space(topSide);
                                            System.out.println("|------------ LOG -------------|");
                                            System.out.println("| Returning to edit...         |");
                                            System.out.println("|------------------------------|");
                                            functionsMenu.space(bottomSide);
                                            functionsMenu.timer();
                                            emailLoop=true;
                                            break;

                                        default:
                                            errorLog("Opção inválida!");
                                            break;

                                    }

                                }

                            }else{

                                emailLoop = false;

                            }

                        }while(emailLoop == true);

                        nameLoop = false;
                        break;

                    case "n":
                        functionsMenu.space(topSide);
                        System.out.println("|------------ LOG -------------|");
                        System.out.println("| Returning to edit...         |");
                        System.out.println("|------------------------------|");
                        functionsMenu.space(bottomSide);
                        functionsMenu.timer();
                        nameLoop = true;
                        break;

                    default:
                        errorLog("Opção inválida!");
                        break;
                }

            }else{

                nameLoop = false;

            }

        }while(nameLoop == true);



    }

    public void creatingUserMenu(String name, String email, String date, String address){

        //login information
        String username;
        String password;
        //Loop
        boolean usernameLoop = true;
        boolean passwordLoop = true;

        System.out.println("|------------------------------|");
        System.out.println("");
        System.out.println(" Nome: " + name );
        System.out.println("");
        System.out.println(" Email: " + email);
        System.out.println("");
        System.out.println(" Birth date: " + date);
        System.out.println("");
        System.out.println(" Address: " + address);
        System.out.println("");
        System.out.println("|------------------------------|");

        //verify if the user wants to use the email as username!

        System.out.println("Você gostaria de criar um username?");
        System.out.println("Caso desejar digite: \"s\".");
        System.out.println("Caso não desejar seu username será o seu email, caso seja o caso digite: \"n\"");
        System.out.println(":: ");

        String operationRequired = input.next();

        switch (operationRequired){
            case "s":
                do{
                    System.out.println("|------------------------------|");
                    System.out.println("Escolha seu nome de usuário: ");
                    System.out.println("|------------------------------|");
                    System.out.println("");

                    System.out.println(":: ");
                    username = input.next();

                    if(username.equals("") == true || functionsMenu.validatorAccUsername(username) == true){
                        errorLog("Username já utilizado ou inválido!");
                    }else{
                        functionsMenu.space(3);
                        System.out.println("|------------------------------|");
                        System.out.println("");
                        System.out.println(" Username: " + username );
                        System.out.println("");
                        System.out.println("|------------------------------|");
                        System.out.println("Confirma o seu username?");
                        System.out.println("OBS: responda com \"s\" ou \"n\"");
                        System.out.println("");

                        System.out.println(":: ");
                        String usernameConfirmation = input.next();

                        switch (usernameConfirmation){
                            case "s":
                                do{
                                    functionsMenu.space(3);
                                    System.out.println("|------------------------------|");
                                    System.out.println("Escolha seu nome de Password: ");
                                    System.out.println("|------------------------------|");
                                    System.out.println("");

                                    System.out.println(":: ");
                                    password = input.next();

                                    if(password.equals("") == true){
                                        errorLog("Insira porfavor um nome de usuário válido!");
                                    }else{
                                        functionsMenu.space(3);
                                        System.out.println("|------------------------------|");
                                        System.out.println("");
                                        System.out.println(" Password: " + password );
                                        System.out.println("");
                                        System.out.println("|------------------------------|");
                                        System.out.println("Confirma a sua senha?");
                                        System.out.println("OBS: responda com \"s\" ou \"n\"");
                                        System.out.println("");

                                        System.out.println(":: ");
                                        String passwordConfirmation = input.next();

                                        switch (passwordConfirmation){
                                            case "s":

                                                LocalDate dateL = LocalDate.parse(date);
                                                int numAccount = plansChooseMenu();
                                                if(numAccount == 0){
                                                    errorLog("Impossible to select a plan!");
                                                }else{
                                                    User user = new User(username, name, email, dateL, address, password, numAccount);
                                                    passwordLoop = false;
                                                }
                                                //Criando novo user!
                                                break;

                                            case "n":
                                                functionsMenu.space(topSide);
                                                System.out.println("|------------ LOG -------------|");
                                                System.out.println("| Returning to edit...         |");
                                                System.out.println("|------------------------------|");
                                                functionsMenu.space(bottomSide);
                                                functionsMenu.timer();
                                                passwordLoop = true;
                                                break;

                                            default:
                                                errorLog("Opção inválida!");
                                                passwordLoop = true;
                                                break;
                                        }
                                    }
                                }while(passwordLoop == true);
                                usernameLoop = false;
                                break;

                            case "n":
                                functionsMenu.space(topSide);
                                System.out.println("|------------ LOG -------------|");
                                System.out.println("| Returning to edit...         |");
                                System.out.println("|------------------------------|");
                                functionsMenu.space(bottomSide);
                                functionsMenu.timer();
                                usernameLoop = true;
                                break;

                            default:
                                errorLog("Opção inválida!");
                                usernameLoop = true;
                                break;
                        }
                    }
                }while(usernameLoop == true);
                break;

            case "n":
                username = email;
                do{
                    functionsMenu.space(3);
                    System.out.println("|------------------------------|");
                    System.out.println("Escolha seu nome de Password: ");
                    System.out.println("|------------------------------|");
                    System.out.println("");

                    System.out.println(":: ");
                    password = input.next();

                    if(password.equals("") == true){
                        errorLog("Insira porfavor um nome de usuário válido!");
                    }else{
                        functionsMenu.space(3);
                        System.out.println("|------------------------------|");
                        System.out.println("");
                        System.out.println(" Password: " + password );
                        System.out.println("");
                        System.out.println("|------------------------------|");
                        System.out.println("Confirma a sua senha?");
                        System.out.println("OBS: responda com \"s\" ou \"n\"");
                        System.out.println("");

                        System.out.println(":: ");
                        String passwordConfirmation = input.next();

                        switch (passwordConfirmation){
                            case "s":

                                LocalDate dateL = LocalDate.parse(date);
                                int numAccount = plansChooseMenu();
                                if(numAccount == 0){
                                    errorLog("Impossible to select a plan!");
                                }else{
                                    User user = new User(username, name, email, dateL, address, password, numAccount);
                                    passwordLoop = false;
                                }
                                //Criando novo user!
                                break;

                            case "n":
                                functionsMenu.space(topSide);
                                System.out.println("|------------ LOG -------------|");
                                System.out.println("| Returning to edit...         |");
                                System.out.println("|------------------------------|");
                                functionsMenu.space(bottomSide);
                                functionsMenu.timer();
                                passwordLoop = true;
                                break;

                            default:
                                errorLog("Opção inválida!");
                                passwordLoop = true;
                                break;
                        }
                    }
                }while(passwordLoop == true);
                break;

            default:
                errorLog("Opção inválida!");
                break;
        }


    }

    public int plansChooseMenu(){

        int numAccount;

        boolean loopPlan = true;

        do{
            functionsMenu.space(topSide);
            System.out.println("       ** DEV IN FLIX **");
            System.out.println("");
            System.out.println("|------ CHOOSE YOUR PLAN ------|");
            System.out.println("| 1. 3 ACCOUNTS ($30,00/month) |");
            System.out.println("| 2. 4 ACCOUNTS ($40,00/month  |");
            System.out.println("| 3. 6 ACCOUNTS ($50,00/month  |");
            System.out.println("|                              |");
            System.out.println("| DIGITE \"SAIR\" PARA VOLTAR  |");
            System.out.println("|------------------------------|");
            System.out.println("");

            System.out.println(":: ");
            int planNumber = input.nextInt();

            switch (planNumber){

                case 1:
                    numAccount = 3;
                    //Plan = 30;
                    return numAccount;

                case 2:
                    numAccount = 4;
                    //Plan = 40;
                    return numAccount;


                case 3:
                    numAccount = 6;
                    //Plan = 50;
                    return numAccount;

                default:
                    errorLog("Opção inválida");
            }
        }while(loopPlan == true);

        return 0;
    }

    //User Logged

    public void clientMenu(String username, String password){

        //Global variable;
        boolean menuLoop = true;

        do{

            int operationID;

            System.out.println("       ** DEV IN FLIX **");
            System.out.println("");
            System.out.println("       BEM VINDO " + functionsMenu.functionsAcc.showName(username, password));
            System.out.println("");
            System.out.println("|------------ MENU ------------|");
            System.out.println("| 1- ACCOUNTS                  |");
            System.out.println("| 2- SEE SUBSCRIBE SITUATION   |"); //Check if the subscribe payment is up to date;
            System.out.println("| 3- EDIT PASSWORD             |");
            System.out.println("| 4- SING OUT                  |");System.out.println("|                              |");
            System.out.println("|                              |");
            System.out.println("|------------------------------|");
            System.out.println("");
            System.out.printf("OPERAÇÃO NUMERO: ");
            operationID = input.nextInt();

            switch (operationID){
                case 1:
                    accountMenu();
                    menuLoop = false;
                    break;

                case 2:
                    //subscribe menu
                    menuLoop = false;
                    break;

                case 3:
                    //chage password menu
                    menuLoop = false;
                    break;

                case 4:
                    menuLoop = false;
                    break;

                default:
                    errorLog("Opção inválida!");
                    break;
            }

        }while(menuLoop == true);

    }

    //Operations Menu

    public void accountMenu(){
        //for editing the account name use index
        //functionsMenu.functionsAcc.editAccountNames(username, password, accountID, accountName);
    }

    public void subscribeMenu(){

    }


}
