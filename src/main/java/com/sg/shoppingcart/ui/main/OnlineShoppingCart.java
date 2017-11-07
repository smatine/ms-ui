package com.sg.shoppingcart.ui.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sg.shoppingcart.*")
public class OnlineShoppingCart {

	public static void main(String[] args) {

		SpringApplication.run(OnlineShoppingCart.class, args);
		final Logger LOGGER = LoggerFactory.getLogger(OnlineShoppingCart.class);
		String customlogger ="ADMS Loger::::";
		LOGGER.info(customlogger+"Online Shopping Cart Service Started....");

	}

}