package org.springframework.gzy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

// * @see BeanClassLoaderAware
// * @see BeanFactoryAware
// * @see InitializingBean
@Component
public class MyUser implements BeanNameAware, InitializingBean{
//	@Resource
	@Autowired
	private MyUser2 myUser2;

	private String name = "gzy";
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
		System.out.println(myUser2.getName());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}



	@Override
	public void setBeanName(String name) {
//		System.out.println(name+"--------------");
	}


	@PostConstruct
	public void init() {
		System.out.println("init @PostConstruct");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy @PreDestroy");
	}


}
