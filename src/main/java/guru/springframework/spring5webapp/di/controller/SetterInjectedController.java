package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.Greeting;
import guru.springframework.spring5webapp.di.service.GreetingImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
  private Greeting greetingService;

  @Qualifier("setterInjectedGreetingService")
  @Autowired
  public void setGreetingService(
      Greeting greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
