package org.springframework.gzy;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyRefreshEventListener implements ApplicationListener<ContextRefreshedEvent> {
//	@Override
//	@EventListener(ContextRefreshedEvent.class)
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("收到容器刷新完的事件");
	}
	@EventListener(ContextRefreshedEvent.class)
	public void onApplicationEvent2(/*ContextRefreshedEvent event*/) {
		System.out.println("收到容器刷新完的事件2");
	}
}
