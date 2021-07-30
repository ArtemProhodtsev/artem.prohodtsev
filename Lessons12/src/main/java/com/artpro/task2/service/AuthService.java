package com.artpro.task2.service;

public interface AuthService {
    //Создать статический метод "checkAuthorization" который будет вызваться из метода main
// и принимает на вход три параметра: login, password и confirmPassword.
    boolean checkAuthorization(String login, String password, String confirmPassword) throws Exception;
}
