package com.example.demo;

import org.springframework.context.ApplicationContext;

import com.example.demo.entities.Item;
import com.example.demo.repositories.ItemRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(ShoppingApplication.class, args);
		
		ItemRepository itemrepository =ctx.getBean(ItemRepository.class); 
		itemrepository.save(new Item("itemA",50));
		itemrepository.save(new Item("itemB",25));

		
	}

}
