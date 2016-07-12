package com.alexbt.mongodb;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServerLauncher {
	
	public static void main(String[] args){
		new SpringApplicationBuilder() //
		.sources(ServerLauncher.class)//
		.profiles("remote")
		.run(args)	;
	}
}
