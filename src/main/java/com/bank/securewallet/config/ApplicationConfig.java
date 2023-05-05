package com.bank.securewallet.config;

import com.bank.securewallet.config.uuid.UUIDGenerator;
import com.bank.securewallet.config.uuid.impl.UUIDGenerateImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public UUIDGenerator uuidGenerator() {
        return new UUIDGenerateImpl();
    }
}
