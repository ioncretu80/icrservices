package com.icrcode.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.icrcode.customer")
public class CustomerApplication {

  public static void main(String[] args) {
    SpringApplication.run(CustomerApplication.class);
  }

}
