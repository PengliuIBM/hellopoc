package com.vmware.hellopoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@SpringBootApplication
public class HellopocApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellopocApplication.class, args);
		System.out.println("this is gitbucket + jenkins + PaaS CICD poc 99987！");
	}

	@Autowired
	ApplicationContext ctx;

	@GetMapping("/")
	public String index() {
		StringBuilder sb = new StringBuilder("<html><body>");
		sb.append("Hello there dear developer Patrick hook9997!！, here are the beans you were looking for: </br>");
//method that returns all the bean names in the context of the application
		Arrays.stream(ctx.getBeanDefinitionNames()).sorted()
				.forEach(
						beanName -> sb.append("</br>").append(beanName)
				);
		sb.append("</body></html>");
		return sb.toString();
	}

	@RequestMapping(value = {"/bar","/foo","hi"})
	public String test(){
		String result = "hello SpringBoot! this is gitbucket + jenkins + PaaS CICD poc!!! hook9997！" + "/bar";
		System.out.println(result);
		return result;
	}

}
