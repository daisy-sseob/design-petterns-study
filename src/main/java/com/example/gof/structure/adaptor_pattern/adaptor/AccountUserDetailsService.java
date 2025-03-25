package com.example.gof.structure.adaptor_pattern.adaptor;

import com.example.gof.structure.adaptor_pattern.adaptee.Account;
import com.example.gof.structure.adaptor_pattern.adaptee.AccountService;
import com.example.gof.structure.adaptor_pattern.target.UserDetails;
import com.example.gof.structure.adaptor_pattern.target.UserDetailsService;

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
