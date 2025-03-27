package com.example.gof.structure.adaptor;

import com.example.gof.structure.adaptor.adaptee.AccountService;
import com.example.gof.structure.adaptor.adaptor.AccountUserDetailsService;
import com.example.gof.structure.adaptor.client.LoginHandler;
import com.example.gof.structure.adaptor.target.UserDetailsService;

public class AdaptorApp {

  public static void main(String[] args) {
    AccountService accountService = new AccountService();
    UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
    LoginHandler loginHandler = new LoginHandler(userDetailsService);
    String login = loginHandler.login("admin", "admin");
    System.out.println(login);
  }
}
 