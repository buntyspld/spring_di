package spring_di.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import spring_di.example.controllers.ConstructorInjectedController;
import spring_di.example.controllers.DIController;
import spring_di.example.controllers.PropertyInjectedController;
import spring_di.example.controllers.SetterInjectedController;

@SpringBootApplication
public class DI_Application {

	public static void main(String[] args)
	{
		ApplicationContext ctx=SpringApplication.run(DI_Application.class, args);

	//	DIController diController= (DIController) ctx.getBean("dIController");
		DIController diController= (DIController) ctx.getBean(DIController.class);
		String message=	diController.sayHello();
		System.out.println("In main method & message is "+message);

		System.out.println("BEGIN...................");
		System.out.println("  dd------PROPERTY");

		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("  dd------CONSTRUCTOR............");

		ConstructorInjectedController constructorInjectedController =(ConstructorInjectedController) ctx.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
		System.out.println("  dd------SETTER............");
		SetterInjectedController setterInjectedController=(SetterInjectedController)ctx.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());

	}

}
