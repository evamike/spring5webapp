package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.Greeting;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  private final Greeting greetingService;

  public MyController(Greeting greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
