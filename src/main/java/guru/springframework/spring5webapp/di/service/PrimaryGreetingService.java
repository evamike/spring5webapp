package guru.springframework.spring5webapp.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements Greeting {

  @Override
  public String sayGreeting() {
    return "Hello World!! - From the Primary Bean";
  }
}
