package com.dev.InventoryService;

import com.dev.InventoryService.entity.Product;
import com.dev.InventoryService.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProductRepository productRepository){
		return args -> {
			productRepository.save(new Product(null,"MSI GF63 95C",3200));
			productRepository.save(new Product(null,"DELL G15",3200));
			productRepository.save(new Product(null,"Lenevo ideopad gaming 3",3200));


		};
	}

}
