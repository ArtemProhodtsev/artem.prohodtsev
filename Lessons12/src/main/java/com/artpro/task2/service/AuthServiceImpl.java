package com.artpro.task2.service;

import com.artpro.task2.exceptions.WrongLoginException;
import com.artpro.task2.exceptions.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthServiceImpl implements AuthService {
    @Override
    public boolean checkAuthorization(String login, String password, String confirmPassword) throws Exception {
//ну тут когда-нибудь в скором времени и в далёкой далёкой Галактике... будет написана логика
        Pattern pattern = Pattern.compile("^[0-9A-Z_a-z]{1,19}$");
        Matcher matcherLogin = pattern.matcher(login);
        Matcher matcherPassword = pattern.matcher(password);
        if (!matcherLogin.matches()) {
            throw new WrongLoginException("В поле ЛОГИН введены некорректные данные");
        }
        if (!matcherPassword.matches()) {
            throw new WrongPasswordException("В поле ПАРОЛЬ введены некорректные данные");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }
}
