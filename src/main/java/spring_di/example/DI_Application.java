package spring_di.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import spring_di.example.controllers.DIController;
@SpringBootApplication
public class DI_Application {

	public static void main(String[] args)
	{
		ApplicationContext ctx=SpringApplication.run(DI_Application.class, args);

	//	DIController diController= (DIController) ctx.getBean("dIController");
		DIController diController= (DIController) ctx.getBean(DIController.class);
		String message=	diController.sayHello();
		System.out.println("In main method & message is "+message);



	}

}
