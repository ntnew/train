package ru.bck.train.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  private static String authorizationRequestBaseUri = "oauth2/authorization";
  Map<String, String> oauth2AuthenticationUrls = new HashMap<>();

  @Autowired
  private ClientRegistrationRepository clientRegistrationRepository;

  @GetMapping("/oauth_login")
  public String getLoginPage(Model model) {
    // ...

    return "oauth_login";
  }
}
