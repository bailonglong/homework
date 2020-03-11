package com.bw.jcart_administration_back;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.SecureRandom;

@Configuration
public class SecureRandomBean {
    @Bean
    public SecureRandom secureRandom(){
        return new SecureRandom();
    }
}
