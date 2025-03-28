package com.example.gof.structure.adaptor.client;

import com.example.gof.structure.adaptor.target.UserDetails;
import com.example.gof.structure.adaptor.target.UserDetailsService;

public class LoginHandler {

  UserDetailsService userDetailsService;

  public LoginHandler(UserDetailsService userDetailsService) {
    this.userDetailsService = userDetailsService;
  }

  public String login(String username, String password) {
    UserDetails userDetails = userDetailsService.loadUser(username);
    if (userDetails.getPassword().equals(password)) {
      return userDetails.getUsername();
    } else {
      throw new IllegalArgumentException();
    }
  }
}
