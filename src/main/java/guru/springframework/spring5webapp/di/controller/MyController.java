package guru.springframework.spring5webapp.di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  public String sayHello() {
    System.out.println("Hello World!");
    return "Hello World!!";
  }
}
