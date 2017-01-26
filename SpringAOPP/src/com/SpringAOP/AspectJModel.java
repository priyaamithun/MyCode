package com.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringAOP.ShapeService.ShapeService;

public class AspectJModel {

	public static void main(String[] args) {
 ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
	ShapeService shapeService = (ShapeService) context.getBean("shapeService");
	shapeService.getCircle().setName("A Dummy Name");
	System.out.println(shapeService.getCircle().getName());
	
	}

}
