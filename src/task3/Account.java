package task3;

import java.util.Objects;

public class Account {
    String name;
    String password;
    String login;

    public Account(String name, String password, String login) {
        this.name = name;
        this.password = password;
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        Account account = (Account) o;
        return login.equals(account.login) && password.equals(account.password);
    }

    @Override
    public String toString() {
        return "Account{" +
                "Имя= '" + name + '\'' +
                ", Пароль= '" + password + '\'' +
                ", Логин= '" + login + '\'' +
                '}';
    }
}
