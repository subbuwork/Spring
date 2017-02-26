/**
 * 
 */
package org.spring.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.java.service.impl.BeansLifeCycles;

/**
 * @author subbu
 *
 */
public class ManageBeanLifeCycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		BeansLifeCycles cycles =(BeansLifeCycles)context.getBean("lifeCycle");
		cycles.setMessage("Hello...");
		System.out.println(cycles.getmessage());
		BeansLifeCycles cycles2 =(BeansLifeCycles)context.getBean("lifeCycle");
		System.out.println("Second time...."+cycles.getmessage());
		context.registerShutdownHook();
	}

}
