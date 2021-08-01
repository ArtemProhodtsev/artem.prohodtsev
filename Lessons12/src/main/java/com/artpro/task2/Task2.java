package com.artpro.task2;

import com.artpro.task2.service.AuthService;
import com.artpro.task2.service.AuthServiceImpl;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String[]> listForBrute = List.of(
                new String[]{"login", "psw", "confPsw"},
                new String[]{"login", "psw11111111111111111111111", "psw11111111111111111111111"},
                new String[]{"login1", "psw1", "psw1"},
                new String[]{"йцу", "йцуй", "йцуйцу1"},
                new String[]{"login1@", "psw1@", "confPsw@"},
                new String[]{"login1@11111111", "psw1@111111111111111", "confPsw@11111111111111111"},
                new String[]{"_abc", "aaa", "aaa"}
                //тут у нас будут кейсы
        );
        AuthService service = new AuthServiceImpl();
        for (String[] check : listForBrute) {
            System.out.println("Login: " + check[0] + "; Password: " + check[1] + "; Confirmation: " + check[2] + ";");
            // [0] = login [1] = psw;
            try {
                System.out.println(service.checkAuthorization(check[0], check[1], check[2]) ? "Code 200" : "Code 404");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

