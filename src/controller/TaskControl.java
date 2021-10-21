package controller;

import task1.Task1Menu;
import task2.Task2Menu;
import task3.Task3Menu;

import java.util.Scanner;

public class TaskControl {
    public static void StartAllTask(){
        int input = 0;
        Scanner scan = new Scanner(System.in);

        while (input!=4){
            System.out.println("Запустить задание 1(Phone)\n" +
                    "Запустить задание 2(Fruit)\n" +
                    "Запустить задание 3(Account)\n" +
                    "Выход");
            input = scan.nextInt();
            if (input == 1){
                Task1Menu.Start();
            } else if (input == 2){
                Task2Menu.start();
            } else if (input == 3){
                Task3Menu.StartTask3();
            }
        }
    }
}
