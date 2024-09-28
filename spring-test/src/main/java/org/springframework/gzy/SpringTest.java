package org.springframework.gzy;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan
@Import(MyUser2.class )
public class SpringTest{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringTest.class);


		//获取bean
		MyUser bean = context.getBean(MyUser.class);
		String name = bean.getName();
		System.out.println(name);
		bean.sout();
		//获取bean
		MyUser2 bean2 = context.getBean(MyUser2.class);
		String name2 = bean2.getName();
		System.out.println(name2);
		bean2.sout();
		//获取bean
		SpringTest bean3 = context.getBean(SpringTest.class);
		bean3.sout();

		Zhangyu zhangyu = context.getBean(Zhangyu.class);
		System.out.println(zhangyu.name);

		//获取事件发布器
//		ApplicationEventPublisher publisher = context.getBean(ApplicationEventPublisher.class);
//		publisher.publishEvent(new MyEvent("1"));
		context.publishEvent(new MyEvent("2"));
	}

	public void sout(){
		System.out.println("main ouput");
	}

}
