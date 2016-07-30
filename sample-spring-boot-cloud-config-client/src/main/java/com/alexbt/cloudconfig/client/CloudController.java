package com.alexbt.cloudconfig.client;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud")
public class CloudController {

	@Value("${testproperty}")
	private String env;
	
	@RequestMapping(method = RequestMethod.GET)
	public String findByRepo() throws IOException {
		return env;
	}
}
