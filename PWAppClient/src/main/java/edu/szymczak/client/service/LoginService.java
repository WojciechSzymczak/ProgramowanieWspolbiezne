package edu.szymczak.client.service;

import edu.szymczak.common.service.*;

public interface LoginService {

    LoginOutputDAO login(LoginInputDAO loginInputDAO);
}