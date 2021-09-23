package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.Greeting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
private final Greeting greetingService;

  public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService")
      Greeting greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
