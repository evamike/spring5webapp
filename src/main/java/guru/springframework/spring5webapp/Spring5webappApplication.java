package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.di.controller.ConstructorInjectedController;
import guru.springframework.spring5webapp.di.controller.MyController;
import guru.springframework.spring5webapp.di.controller.PropertyInjectedController;
import guru.springframework.spring5webapp.di.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Spring5webappApplication.class, args);
		MyController myController = (MyController)applicationContext.getBean("myController");
		String helloWorld = myController.sayHello();
		System.out.println("bean=" + helloWorld);

		System.out.println("--------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)applicationContext.getBean("propertyInjectedController");
		System.out.println("property=" + propertyInjectedController.getGreeting());

		System.out.println("--------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController)applicationContext.getBean("setterInjectedController");
		System.out.println("setter=" + setterInjectedController.getGreeting());
		System.out.println("--------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)applicationContext.getBean("constructorInjectedController");
		System.out.println("constructor=" + constructorInjectedController.getGreeting());

	}
}
