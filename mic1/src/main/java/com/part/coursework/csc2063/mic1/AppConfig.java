package com.part.coursework.csc2063.mic1;

import org.glassfish.jersey.server.ResourceConfig;
//import jakarta.ws.rs.ApplicationPath;
import org.springframework.context.annotation.Configuration;
import com.part.coursework.csc2063.mic1.controller.Controller;

@Configuration
//@ApplicationPath("/")
public class AppConfig extends ResourceConfig{
	public AppConfig() {
		register(Controller.class);
	}

}
