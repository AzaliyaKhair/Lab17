package ru.itis11403;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Means {
    public static Role userCheck (String login, String password) throws WrongLoginException, WrongPasswordException, WrongLoginOrPasswordException {
        return null;
    }

    private boolean isValidLogin(String login) {
        if (login.length() < 20) return false;
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9@._-]{20,}$");
        Matcher matcher = pattern.matcher(login);
        return matcher.matches();
    }

    private boolean isValidPassword(String password) {
        if (password.length() < 8) return false;
        Pattern pattern = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[{}\\[\\](),.;&?!_\\-+]).{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();

    }

    public static void displayMenu(Role role) {
        switch (role) {
            case ADMIN:
                System.out.println("\n--- ADMIN MENU ---");
                System.out.println("1. File");
                System.out.println("2. Create new user");
                System.out.println("3. Exit");
                break;

            case USER:
                System.out.println("\n--- USER MENU ---");
                System.out.println("1. File");
                System.out.println("2. Get play list");
                System.out.println("3. Exit");
                break;
        }
    }

}

