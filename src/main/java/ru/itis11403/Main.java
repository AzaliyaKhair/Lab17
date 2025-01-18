package ru.itis11403;

import java.util.Scanner;

public class Main {

    private User admin = new User(Role.ADMIN, "Azaliya.pochta786@gmailcom", "Cool17[]Q");
    private User user = new User(Role.USER, "Cool17[]Q", "UserPassword998[]");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String password = scanner.nextLine();

        while (true) {
            System.out.print("Введите логин или введите 'exit' для выхода: ");

            if (login.equalsIgnoreCase("exit")) {
                System.out.println("Программа завершена, будем ждать вас! ");
                break;
            }

            System.out.print("Введите пароль: ");

            try {
                Role role = Means.userCheck(login, password);

                if (role != null) {
                    Means.displayMenu(role);
                } else {
                    System.out.println("Неправильный логин или пароль, попробуйте еще раз!\n");
                }

            } catch (WrongLoginException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (WrongPasswordException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

        }
        scanner.close();
    }
}


