package guru.springframework.spring5webapp.di.controller;

import guru.springframework.spring5webapp.di.service.Greeting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

  private final Greeting greetingService;

  public I18nController(@Qualifier("i18nService") Greeting greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
