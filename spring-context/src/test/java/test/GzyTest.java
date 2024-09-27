package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GzyTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(GzyTest.class);
		context.refresh();
		System.out.println(context);
		System.out.println("nihao啊啊");
	}
}
