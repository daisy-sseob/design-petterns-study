package com.example.gof.structure.adaptor_pattern.adaptor;

import com.example.gof.structure.adaptor_pattern.adaptee.Account;
import com.example.gof.structure.adaptor_pattern.target.UserDetails;
import lombok.Getter;

@Getter
public class AccountUserDetails implements UserDetails {
  
  private String name;

  private String password;

  private String email;

  public AccountUserDetails(Account account) {
    this.name = account.getName();
    this.password = account.getPassword();
    this.email = account.getEmail();
  }

  @Override
  public String getUsername() {
    return this.name;
  }
  
}
