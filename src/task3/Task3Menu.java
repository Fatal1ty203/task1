package task3;

import java.util.List;
import java.util.Scanner;

public class Task3Menu {
    public static void StartTask3() {
        List<Account> accList = CreateAccount.CrAc();
        int input = 0;
        String secret = "follow the white rabbit";
        Scanner scanner = new Scanner(System.in);
        boolean isLogin = false;
        while (input!=5){
            System.out.println("1. Вход в аккаунт\n" +
                    "2. Регистрация\n" +
                    "3. Показать секретную фразу\n" +
                    "4. Выход из аккаунта\n" +
                    "5. Выход из программы");
            input = scanner.nextInt();
            if (input==1){
                scanner = new Scanner(System.in);
                System.out.println("Enter you login");
                String login = scanner.nextLine();
                System.out.println("Enter you password");
                String password = scanner.nextLine();
                boolean isExist = accList.contains(new Account(null,password,login));
                if (isExist){
                    System.out.println("Вы вошли в систему");
                    isLogin = true;
                }else {
                    System.out.println("Вы не вошли в систему");
                }

            }else if (input == 2){
                if (isLogin==true){
                    System.out.println("Вы уже вошли в систему, пожалуйста выйдите из вашего аккаунта для продолжения регистрации");
                }else {
                    scanner = new Scanner(System.in);
                    System.out.println("Enter you login");
                    String login = scanner.nextLine();
                    System.out.println("Enter you password");
                    String password = scanner.nextLine();
                    System.out.println("Enter you name");
                    String name = scanner.nextLine();
                    accList.add(new Account(name,login,password));
                }
            }else if (input == 3){
                if (isLogin == true){
                    System.out.println(secret);
                }else {
                    System.out.println("Пожалуйста войдите под своим логином и паролем, чтобы увидеть секретную фразу");
                }
            }else if (input == 4){
                if (isLogin == true){
                    System.out.println("Вы вышли из аккаунта");
                    isLogin = false;
                }else{
                    System.out.println("Вы еще не вошли в свой аккаунт");
                }
            }else if (input == 5){
                break;
            }
        }
    }



}
