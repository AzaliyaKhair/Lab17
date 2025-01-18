package ru.itis11403;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CheckUser {
    private User admin = new User(Role.ADMIN, "adminLogin@example.com", "AdminPassword962{}");
    private User user = new User(Role.USER, "userLogin@example.com", "UserPassword998[]");

    private boolean isValidLogin(String login) {
        if (login.length() < 20) return false;
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9@._-]{20,}$");
        Matcher matcher = pattern.matcher(login);
        return matcher.matches();
    }

    private boolean isValidPassword(String password) {
        if (password.length() < 8) return false;
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9\\{\\[\\]\\(\\),.;&?!_-+]{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();

    }
}

