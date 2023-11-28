package com.example.springboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootProducerApplication implements CommandLineRunner  {
 
	public static void main(String args[]) {
		SpringApplication.run(SpringbootProducerApplication.class);
	}
 
	@Autowired
	private WikimediaChangesProducer wikimediaChangesProducer;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		wikimediaChangesProducer.sendMessage();
	}
}
