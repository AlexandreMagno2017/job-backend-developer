package br.com.intelipost.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication(scanBasePackages = "br.com.intelipost")
@ComponentScan({ "br.com.intelipost" })
@EntityScan("br.com.intelipost.entities")
@EnableJpaRepositories("br.com.intelipost.repository")
@EnableAutoConfiguration
public class IntelipostApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(IntelipostApplication.class, args);
    }
}
