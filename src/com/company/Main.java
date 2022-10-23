package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
            boolean continuement = true;
            Scanner sc = null;
            while (continuement = true) {

                    System.out.print("Введите ваше имя: ");
                    sc = new Scanner(System.in);
                    String name = sc.nextLine();
                    System.out.println("Your name: " + name);
                    System.out.print("Введите вашу фамилию: ");
                    sc = new Scanner(System.in);
                    String lastName = sc.nextLine();
                    System.out.println("Your last Name: " + lastName);
                    System.out.print("Введите ваше отчество: ");
                    sc = new Scanner(System.in);
                    String patronymic = sc.nextLine();
                    System.out.println("Your patronymic: " + patronymic);
                    System.out.print("Введите ваш возраст: ");
                    sc = new Scanner(System.in);
                    Integer age = sc.nextInt();
                    System.out.println("Your age: " + age);
                    System.out.println();
                    System.out.println("Ваша информация ниже: ");
                    System.out.println("----------------------");
                    System.out.println("Full name: " + name + " " + lastName + " " + patronymic);
                    System.out.println("Age: " + age);
                    System.out.println("---------------------");
                    System.out.print("Ваша информация указана верно? ");
                    sc = new Scanner(System.in);
                    String checking = sc.nextLine();
                    if (checking.equalsIgnoreCase("Yes") | checking.equalsIgnoreCase("Да") | checking.equalsIgnoreCase("true")) {
                            Boolean chekage;
                            System.out.println("Благодарим за сотрудничество.");
                            continuement = false;
                    }
                    if (checking.equalsIgnoreCase("false") | checking.equalsIgnoreCase("No") | checking.equalsIgnoreCase("Nope") | checking.equalsIgnoreCase("Нет")) {
                            Boolean chekage = false;
                            System.out.println("Просим вас перепройти форму.");
                    }
            }
            sc.close();
    }
}
