package com.example.gof.structure.adaptor_pattern;

import com.example.gof.structure.adaptor_pattern.adaptee.AccountService;
import com.example.gof.structure.adaptor_pattern.adaptor.AccountUserDetailsService;
import com.example.gof.structure.adaptor_pattern.client.LoginHandler;
import com.example.gof.structure.adaptor_pattern.target.UserDetailsService;

public class AdaptorApp {

  public static void main(String[] args) {
    AccountService accountService = new AccountService();
    UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
    LoginHandler loginHandler = new LoginHandler(userDetailsService);
    String login = loginHandler.login("admin", "admin");
    System.out.println(login);
  }
}
 