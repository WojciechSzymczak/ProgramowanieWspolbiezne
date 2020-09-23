package edu.szymczak.client.service;

import edu.szymczak.common.service.LoginInputDAO;
import edu.szymczak.common.service.LoginOutputDAO;
import org.springframework.stereotype.Component;

@Component
public class BasicLoginService implements LoginService {

    public LoginOutputDAO login(LoginInputDAO loginInputDAO) {
        return null;
    }
}