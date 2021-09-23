package guru.springframework.spring5webapp.di.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements Greeting {

  @Override
  public String sayGreeting() {
    return "Hello World!! - Setter";
  }
}
