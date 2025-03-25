package com.example.gof.structure.adaptor_pattern.adaptee;

public class AccountService {

  public Account findAccountByUsername(String username) {
    Account account = new Account();
    account.setName(username);
    account.setPassword(username);
    account.setEmail(username);
    return account;
  }

  public void createNewAccount(Account account) {

  }

  public void updateAccount(Account account) {

  }

}
