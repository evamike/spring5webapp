package guru.springframework.spring5webapp.di.controller;


import guru.springframework.spring5webapp.di.service.GreetingImpl;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectedControllerTest {

  PropertyInjectedController controller;

  //@BeforeEach
  @Before
  public void setUp() {
    controller = new PropertyInjectedController();
    controller.greetingService = new GreetingImpl();
  }

  @Test
  public void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}