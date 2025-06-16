package br.com.wine_products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WineProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WineProductsApplication.class, args);
	}

}
