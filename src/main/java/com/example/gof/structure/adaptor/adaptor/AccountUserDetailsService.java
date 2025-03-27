package com.example.gof.structure.adaptor.adaptor;

import com.example.gof.structure.adaptor.adaptee.Account;
import com.example.gof.structure.adaptor.adaptee.AccountService;
import com.example.gof.structure.adaptor.target.UserDetails;
import com.example.gof.structure.adaptor.target.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

  private final AccountService accountService;

  public AccountUserDetailsService(AccountService accountService) {
    this.accountService = accountService;
  }

  @Override
  public UserDetails loadUser(String username) {
    Account account = accountService.findAccountByUsername(username);
    return new AccountUserDetails(account);
  }
}
