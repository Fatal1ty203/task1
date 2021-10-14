package task3;

import java.util.ArrayList;
import java.util.List;

public class CreateAccount {
    public static List<Account> CrAc(){
        List<Account> newAccount = new ArrayList<>();
        newAccount.add(new Account("Vasiliy","pas123","vasacc"));
        newAccount.add(new Account("Sema","pas124","semacc"));
        newAccount.add(new Account("Leonid","pas125","leoacc"));
        newAccount.add(new Account("Pavel","pas126","pavacc"));
        newAccount.add(new Account("Hzkto","pas127","hzacc"));
        return newAccount;
    }
}
