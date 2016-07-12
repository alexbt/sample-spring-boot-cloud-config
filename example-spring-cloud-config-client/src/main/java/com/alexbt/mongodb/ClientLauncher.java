package com.alexbt.mongodb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ClientLauncher {
	
	@Value("${testproperty}")
	private String env;
	
	public static void main(String[] args){
		new SpringApplicationBuilder() //
		.sources(ClientLauncher.class)//
		.profiles("remote")
		.run(args);
	}
}
