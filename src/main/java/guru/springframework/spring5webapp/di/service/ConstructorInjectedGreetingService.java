package guru.springframework.spring5webapp.di.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements Greeting {

  @Override
  public String sayGreeting() {
    return "Hello World!! - Constructor";
  }
}