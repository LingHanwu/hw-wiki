package com.hanwu.wiki;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
@Slf4j
@SpringBootApplication
public class  WikiApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(WikiApplication.class);
		Environment env = app.run(args).getEnvironment();

//		LOG.info("启动成功!");
		log.info("项目启动成功！");
		log.info("运行地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));
	}

}
