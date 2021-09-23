package guru.springframework.spring5webapp.di.controller;

import static org.junit.Assert.*;

import guru.springframework.spring5webapp.di.service.GreetingImpl;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {

  SetterInjectedController controller;
  @Before
  public void setUp() throws Exception {
  controller = new SetterInjectedController();
  controller.setGreetingService(new GreetingImpl());
  }

  @Test
  public void getGreeting() {
    System.out.println(controller.getGreeting());

  }
}