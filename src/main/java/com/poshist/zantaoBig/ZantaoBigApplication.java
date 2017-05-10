package com.poshist.zantaoBig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class ZantaoBigApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ZantaoBigApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZantaoBigApplication.class, args);
	}
}
