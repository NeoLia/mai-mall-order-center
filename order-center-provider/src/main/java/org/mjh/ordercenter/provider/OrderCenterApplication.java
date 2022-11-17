package org.mjh.ordercenter.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: Neo Lia Marx
 * @date: 2022/11/17 23:51
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.mjh.ordercenter")
public class OrderCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderCenterApplication.class, args);
    }
}
