package org.springframework.gzy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order(0)
public class MyUser2 implements BeanNameAware {

	@Autowired
	private MyUser myUser;
	private String name = "gzy222";
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sout() {
		System.out.println(myUser.getName());
	}

	@Override
	public void setBeanName(String name) {
		System.out.println(name+"--------------");
	}


}
