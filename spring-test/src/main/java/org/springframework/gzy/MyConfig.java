package org.springframework.gzy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MyConfig {
	@Bean
	@Profile("dev")
	public Zhangyu zhangyu111(){
		return new Zhangyu();
	}
}
//gaozhiyuan
//ga_zh_yu_n

//zhangyu
//zhangyu AOI
