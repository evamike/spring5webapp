package guru.springframework.spring5webapp.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements Greeting{

  @Override
  public String sayGreeting() {
    return "Hello - EN";
  }
}
